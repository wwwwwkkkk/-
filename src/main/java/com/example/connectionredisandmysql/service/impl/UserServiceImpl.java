package com.example.connectionredisandmysql.service.impl;

import com.example.connectionredisandmysql.entity.User;
import com.example.connectionredisandmysql.mapper.UserMapper;
import com.example.connectionredisandmysql.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Administrator
 * @since: 2022/12/5 15:28
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer insertUser(User user) {
        return userMapper.insertUserData(user);
    }
}
