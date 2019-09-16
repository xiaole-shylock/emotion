package com.emotion.anxious.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnxiousProperties {
    @Value("${com.emotion.title}")
    private String title;

}
