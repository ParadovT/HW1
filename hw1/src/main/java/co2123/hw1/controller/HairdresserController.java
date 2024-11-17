package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Hairdresser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HairdresserController {

    // GET request to show the form for creating a new Hairdresser
    @GetMapping("/newHairdresser")
    public String newHairdresserForm(Model model) {
        model.addAttribute("hairdresser", new Hairdresser());
        return "form"; // Updated path: now points to /WEB-INF/views/form.jsp
    }

    // GET request to show the list of Hairdressers
    @GetMapping("/hairdressers")
    public String listHairdressers(Model model) {
        model.addAttribute("hairdressers", Hw1Application.hairdressers);
        return "list"; // Updated path: now points to /WEB-INF/views/list.jsp
    }

    // POST request to add a new Hairdresser to the list
    @PostMapping("/addHairdresser")
    public String addHairdresser(Hairdresser hairdresser) {
        hairdresser.setId(Hw1Application.hairdressers.size() + 1); // Set a new ID
        Hw1Application.hairdressers.add(hairdresser);
        return "redirect:/hairdressers";
    }
}
