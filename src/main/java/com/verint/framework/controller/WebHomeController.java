package com.verint.framework.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebHomeController {

    @RequestMapping("/")
    public String homePage(){
        return "home/index";
    }

}
