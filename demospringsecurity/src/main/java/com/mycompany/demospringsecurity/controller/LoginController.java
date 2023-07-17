package com.mycompany.demospringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String ShowMyLoginPage(){
        return "plain-login";
    }
}
