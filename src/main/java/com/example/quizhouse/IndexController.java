package com.example.quizhouse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(value = "/")
    public String index(Model model) {
        System.out.println("dsadada");
        model.addAttribute("tekst","dsadasdada");
        return "index";
    }
}
