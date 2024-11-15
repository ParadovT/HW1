package co2123.hw1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String showStartPageGet() {
        // This method handles GET requests for "/"
        return "start";
    }

    @PostMapping
    public String showStartPagePost() {
        // This method handles POST requests for "/"
        return "start";
    }
}
