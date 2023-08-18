package com.fquery.horceracing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String sayHello(Model theModel){

        return "hello-page";
    }
    
}
