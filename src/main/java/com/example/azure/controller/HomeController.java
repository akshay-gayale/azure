package com.example.azure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String viewHomePage() {
        return "index";
    }

    @RequestMapping("/welcome")
    public String viewWelcomePage() {
        return "welcome";
    }
}
