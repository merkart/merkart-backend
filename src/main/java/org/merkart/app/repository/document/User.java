package org.merkart.app.repository.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;



@Getter
@Setter
public class User {
    @Id
    protected String id;

    protected String name;
    protected String lastname;
    protected String typeOfId;
    protected String idNumber;
    protected String country;
    protected String phone;
    protected String email;
    protected String password;

}
