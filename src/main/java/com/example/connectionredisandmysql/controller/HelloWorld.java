package com.example.connectionredisandmysql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Administrator
 * @since: 2022/12/5 11:42
 * @description:
 */
@RestController
@RequestMapping(value = "/mukelong")
public class HelloWorld {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "hi";
    }

}
