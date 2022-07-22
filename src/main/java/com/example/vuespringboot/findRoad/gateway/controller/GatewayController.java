package com.example.vuespringboot.findRoad.gateway.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/gw")
public class GatewayController {

    @RequestMapping("/message")
    public String hello() {
        return "Full Stack Vuejs and Spring boot";
    }
}
