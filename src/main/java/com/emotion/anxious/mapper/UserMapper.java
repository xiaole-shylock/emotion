package com.emotion.anxious.mapper;

import com.emotion.anxious.model.dao.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where username=#{username}")
    User findByUsername(String username);
}
