package com.realworld.io.responses;


import lombok.Getter;
import lombok.Setter;

public class LoginResponse {
    @Getter
    @Setter
    private String token;

    @Getter
    @Setter
    private long expiresIn;
}
