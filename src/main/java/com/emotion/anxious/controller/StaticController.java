package com.emotion.anxious.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("static")
public class StaticController {

    @GetMapping("1")
    public String view1() {
        return "demo1";
    }
}
