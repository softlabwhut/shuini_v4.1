package com.whut.shuini.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(){
        return "shuini project start!";
    }

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello_test(){
        return "shuini project hello!";
    }
}
