package com.example.connectionredisandmysql.mapper;

import com.example.connectionredisandmysql.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author: Administrator
 * @since: 2022/12/5 15:05
 * @description:
 */
@Mapper
public interface UserMapper {

    int insertUserData(User user);

}
