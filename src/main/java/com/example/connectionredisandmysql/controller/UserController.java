package com.example.connectionredisandmysql.controller;

import com.example.connectionredisandmysql.entity.User;
import com.example.connectionredisandmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;

/**
 * @author: Administrator
 * @since: 2022/12/5 15:29
 * @description:
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST,value = "/insertUser")
    public Integer insertUser(@RequestBody User user){
        return userService.insertUser(user);
    }

}
