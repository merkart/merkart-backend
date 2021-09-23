package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.Controller.Dto.UserDto;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public abstract class User {
    @Id
    private String id;
    private String name;
    private String lastname;
    private String typeOfId;
    private String idNumber;
    private String country;
    private String phone;
    private String email;
    private String password;

    public User(UserDto userDto) {
        this.name = userDto.getName();
        this.lastname = userDto.getLastname();
        this.typeOfId = userDto.getTypeOfId();
        this.idNumber = userDto.getIdNumber();
        this.country = userDto.getCountry();
        this.phone = userDto.getPhone();
        this.email = userDto.getEmail();
        this.password = userDto.getPassword();

    }

}
