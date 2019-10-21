package com.valerii.buildersitework.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class GreetingController {

    private LocalDate date;

    @GetMapping("/about.html")
    public String getAbout (Model model) {
        model.addAttribute("about", date = LocalDate.now());
        model.addAttribute("test2","[thyz ntcn");
        return "about";
    }
    @GetMapping("/index.html")
    public String getMain (Model model) {
        model.addAttribute("about", date = LocalDate.now());
        return "index";
    }
}
