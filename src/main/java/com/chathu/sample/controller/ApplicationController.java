package com.chathu.sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/chathu")
public class ApplicationController {

    @RequestMapping(value = "/print", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String returnString(){
        return "Hello SpringBoot";
    }
}
