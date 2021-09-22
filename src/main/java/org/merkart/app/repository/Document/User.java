package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
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
}
