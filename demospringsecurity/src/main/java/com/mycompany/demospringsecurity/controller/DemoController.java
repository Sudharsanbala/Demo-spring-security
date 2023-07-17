package com.mycompany.demospringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DemoController {
    @GetMapping("/")
    public String homepage(){
        return "home";
    }

    @GetMapping("/leaders")
    public String leaderpage(){
        return "leaders";
    }


}
