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

        // Create Stylist objects with necessary arguments
        Stylist stylist1 = new Stylist("Noel", "Cutting, Styling", "Intermediate", 50);
        Stylist stylist2 = new Stylist("Tyler", "Coloring, Highlights", "Advanced", 80);

        // Create Hairdresser with the stylists list and other required arguments
        Hairdresser hairdresser = new Hairdresser(1, "New York", "Modern Hairstyles", Arrays.asList(stylist1, stylist2));

        // Add the hairdresser to the static list
        hairdressers.add(hairdresser);
    }
}
