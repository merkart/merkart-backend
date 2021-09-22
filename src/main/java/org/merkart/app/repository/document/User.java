package org.merkart.app.repository.document;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.controller.user.UserDto;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCrypt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Document
public class User
{
    @Id
    String id;

    String name;

    String lastName;

    @Indexed( unique = true )
    String email;

    List<RoleEnum> roles;

    Date createdAt;

    private String typeOfId;
    private String idNumber;

    private String country;
    private String phone;

    private String password;

    public User()
    {
    }


    public User( UserDto userDto )
    {
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
        createdAt = new Date();
        roles = new ArrayList<>( Collections.singleton( RoleEnum.USER ) );
        //TODO uncomment this line
        password = BCrypt.hashpw( userDto.getPassword(), BCrypt.gensalt() );
    }




    public List<RoleEnum> getRoles()
    {
        return roles;
    }

    public void update( UserDto userDto )
    {
        this.name = userDto.getName();
        this.lastName = userDto.getLastName();
        this.email = userDto.getEmail();
        //TODO uncomment these lines
        if ( userDto.getPassword() != null )
        {
            this.password = BCrypt.hashpw( userDto.getPassword(), BCrypt.gensalt() );
        }
    }
}

