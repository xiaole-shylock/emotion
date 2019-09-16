package com.emotion.anxious;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.emotion.anxious.mapper")
@EnableScheduling
public class AnxiousApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnxiousApplication.class, args);
    }

}
