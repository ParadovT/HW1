package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Hairdresser;
import co2123.hw1.domain.Stylist;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StylistController {

    // GET request to list stylists of a specific hairdresser
    @GetMapping("/stylists")
    public String listStylists(@RequestParam("hairdresser") int hairdresserId, Model model) {
        // Find the corresponding Hairdresser by ID
        Hairdresser hairdresser = Hw1Application.hairdressers.stream()
                .filter(h -> h.getId() == hairdresserId)
                .findFirst()
                .orElse(null);

        if (hairdresser == null) {
            model.addAttribute("error", "Hairdresser not found");
            return "error"; // Display an error page if no hairdresser is found
        }

        // Add the list of stylists to the model
        model.addAttribute("stylists", hairdresser.getStylists());
        model.addAttribute("hairdresserId", hairdresserId); // Pass the ID for the "newStylist" link
        return "stylists/list"; // View for the stylists
    }

    // GET request to show form for creating a new stylist
    @GetMapping("/newStylist")
    public String newStylistForm(@RequestParam("hairdresser") int hairdresserId, Model model) {
        model.addAttribute("stylist", new Stylist());
        model.addAttribute("hairdresserId", hairdresserId); // Pass hairdresser ID for the form
        return "stylists/form"; // View for the form
    }

    // POST request to add a new stylist
    @PostMapping("/addStylist")
    public String addStylist(@ModelAttribute Stylist stylist, @RequestParam("hairdresser") int hairdresserId, Model model) {
        // Find the corresponding Hairdresser by ID
        Hairdresser hairdresser = Hw1Application.hairdressers.stream()
                .filter(h -> h.getId() == hairdresserId)
                .findFirst()
                .orElse(null);

        if (hairdresser != null) {
            // Add the new stylist to the hairdresser's list of stylists
            hairdresser.getStylists().add(stylist);
        } else {
            model.addAttribute("error", "Hairdresser not found for ID: " + hairdresserId);
            return "error"; // Show an error page if hairdresser not found
        }

        // Redirect to the updated list of stylists for the hairdresser
        return "redirect:/stylists?hairdresser=" + hairdresserId;
    }
}
