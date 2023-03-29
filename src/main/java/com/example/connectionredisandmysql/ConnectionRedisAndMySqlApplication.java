package com.example.connectionredisandmysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 与在mapper接口中添加@mapper注解一样效果，只不过加在这会降低耦合
// @MapperScan("com.example.connectionredisandmysql.mapper")
public class ConnectionRedisAndMySqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConnectionRedisAndMySqlApplication.class, args);
    }

}
