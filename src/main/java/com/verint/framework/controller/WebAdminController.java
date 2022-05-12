package com.verint.framework.controller;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class WebAdminController {

    @GetMapping("")
    public String adminPage(Model model, Authentication authentication){
        model.addAttribute("user", authentication.getName());
        return "admin/index";
    }

}
