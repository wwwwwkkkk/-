package com.example.connectionredisandmysql.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author: Administrator
 * @since: 2022/12/5 15:04
 * @description:
 */
@Data
public class User {

    /*
    用户id
     */
    private Integer id;

    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
