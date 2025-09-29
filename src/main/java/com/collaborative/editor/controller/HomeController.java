package com.collaborative.editor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String home() {
        // Looks for src/main/resources/static/index.html (if it exists)
        return "redirect:/index.html";
    }
}
