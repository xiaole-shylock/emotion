package com.emotion.anxious.model.dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class User {
    private Long id;
    private String username;
    private String password;
}
