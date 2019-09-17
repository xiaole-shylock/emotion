package com.emotion.anxious.controller;

import com.emotion.anxious.mapper.UserMapper;
import com.emotion.anxious.model.dao.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.UUID;

@RestController
public class HelloWorldController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("uid")
    String uid(HttpSession session) {
        UUID uuid = (UUID) session.getAttribute("uid");
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        session.setAttribute("uid", uuid);
        return session.getId();
    }

    @RequestMapping("findAllUsers")
    List<User> findAllUsers() {
        return userMapper.findAll();
    }
}
