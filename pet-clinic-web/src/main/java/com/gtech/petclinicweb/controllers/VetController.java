package com.gtech.petclinicweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
public class VetController {

    @GetMapping({"", "/index", "/index.html"})
    public String getVets(){
        return "vets/index";
    }
}
