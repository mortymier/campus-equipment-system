package edu.cit.saniel.mitchel.campusequipmentloan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController
{
    @GetMapping("/login")
    public String login()
    {
        return "login"; // This refers to login.html in the templates directory
    }

    @GetMapping("/studenthome")
    public String studenthome()
    {
        return "studenthome";
    }
}
