package org.merkart.app.controller.auth;

import lombok.Getter;

@Getter
public class LoginDto
{
    private String email;

    private String password;

    public LoginDto( String email, String password )
    {
        this.email = email;
        this.password = password;
    }

}