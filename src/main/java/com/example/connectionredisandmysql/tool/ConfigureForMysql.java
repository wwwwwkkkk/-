package com.example.connectionredisandmysql.tool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author: Administrator
 * @since: 2022/12/5 14:26
 * @description:
 */
@Configuration
public class ConfigureForMysql {

    @Autowired
    private JdbcTemplate jdbcTemplate;

}
