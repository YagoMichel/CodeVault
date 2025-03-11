package com.yago.html_plantillas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;





@Controller
public class homeController {
    @GetMapping
    public String home() {
        return "index";
    }
    @GetMapping("/elements")
    public String home_elements() {
        return "elements";
    }
    @GetMapping("/generic")
    public String home_generic() {
        return "generic";
    }
    @GetMapping("/landing")
    public String home_landing() {
        return "landing";
    }
    
    
}
