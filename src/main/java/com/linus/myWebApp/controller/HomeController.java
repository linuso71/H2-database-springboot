package com.linus.myWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping("/")
//    @ResponseBody
    public String Greet(){
        return "hewloooooooo";
    }
}
