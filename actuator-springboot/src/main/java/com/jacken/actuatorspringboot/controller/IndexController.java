package com.jacken.actuatorspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @RequestMapping("/index")
    public  String index(){
        return "index";
    }
}
