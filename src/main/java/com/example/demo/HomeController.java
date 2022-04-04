package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


public class HomeController {
    @GetMapping("/index")
    public String ViewForm(Model model)
    {
        return "index";
    }}
