package org.merkart.app.repository.documents;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.controller.dto.UserDto;
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
    private String id;

    private String name;

    private String lastName;

    @Indexed( unique = true )
    private String email;

    private List<RoleEnum> roles;

    private Date createdAt;

    private String typeOfId;
    private String idNumber;

    private String country;
    private String phone;

    private String password;
    private List<Invoice> invoices;

    
    public User() {}

    public User( UserDto userDto )
    {
        name = userDto.getName();
        lastName = userDto.getLastName();
        email = userDto.getEmail();
        createdAt = new Date();
        roles = new ArrayList<>( Collections.singleton( RoleEnum.USER ) );
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
        if ( userDto.getPassword() != null )
        {
            this.password = BCrypt.hashpw( userDto.getPassword(), BCrypt.gensalt() );
        }
    }
}

