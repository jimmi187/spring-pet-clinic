package com.jimi.springpetclinic.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"/index","/index.html","/",""})
    public String listowners() {
        return "owners/index";
    }

}
