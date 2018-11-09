package com.grind.timemet.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
@RequestMapping("/timemet")
public class Controller {
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getTimemetInfo(){
        return "Info about timemet";
    }
}
