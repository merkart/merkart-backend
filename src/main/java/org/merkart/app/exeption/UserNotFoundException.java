package org.merkart.app.exeption;


import org.merkart.app.error.ErrorCodeEnum;
import org.merkart.app.error.InternalServerErrorException;
import org.springframework.http.HttpStatus;

public class UserNotFoundException
        extends InternalServerErrorException
{
    public UserNotFoundException()
    {
        super( new ServerErrorResponseDto( "User not found", ErrorCodeEnum.USER_NOT_FOUND, HttpStatus.NOT_FOUND ),
                HttpStatus.NOT_FOUND );
    }
}
