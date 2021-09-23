package org.merkart.app.service;


import org.merkart.app.controller.user.UserDto;
import org.merkart.app.exeption.UserNotFoundException;
import org.merkart.app.repository.documents.User;

import java.util.List;

public interface UserService
{
    User create( UserDto userDto );

    User findById( String id )
            throws UserNotFoundException;

    User findByEmail( String email )
            throws UserNotFoundException;

    List<User> all();

    boolean deleteById( String id );

    User update( UserDto userDto, String id );
}

