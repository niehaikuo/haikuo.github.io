package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: haikuo.nie
 * @Date: 2019/7/24 11:47
 * @Description:
 */
@RestController
@RequestMapping("/demo")
public class TestRest {

    @RequestMapping("/hello/{name}")
    public String test(@PathVariable("name") String name){
        return "helleo:     " + name;
    }
}
