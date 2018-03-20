package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/login")
    public String login(Model model){
        return "";
    }
}
