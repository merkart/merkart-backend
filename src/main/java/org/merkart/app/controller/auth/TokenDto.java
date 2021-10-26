package org.merkart.app.controller.auth;

import java.util.Date;

import lombok.Getter;

@Getter
public class TokenDto
{

    private String token;

    private Date expirationDate;

    public TokenDto( String token, Date expirationDate )
    {
        this.token = token;
        this.expirationDate = expirationDate;
    }

}