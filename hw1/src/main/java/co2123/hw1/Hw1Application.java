package co2123.hw1;

import co2123.hw1.domain.Hairdresser;
import co2123.hw1.domain.Stylist;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Hw1Application {

    // Static list to store Hairdresser objects
    public static List<Hairdresser> hairdressers = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);

        // Initialize the hairdressers and stylists
        initializeData();
    }

    // Method to initialize data
    private static void initializeData() {
        // Create Stylist objects
        Stylist stylist1 = new Stylist("Noel", "Cutting, Styling", "Intermediate", 50);
        Stylist stylist2 = new Stylist("Tyler", "Coloring, Highlights", "Advanced", 80);

        // Create Hairdresser with the list of stylists
        Hairdresser hairdresser = new Hairdresser(1, "Leicester", "Modern Hairstyles", new ArrayList<>(Arrays.asList(stylist1, stylist2)));

        // Add the hairdresser to the static list
        hairdressers.add(hairdresser);
    }

    // Method to retrieve a Hairdresser by ID
    public static Hairdresser getHairdresserById(int id) {
        return hairdressers.stream()
                .filter(h -> h.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
