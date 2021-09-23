package org.merkart.app.repository.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;


@Getter
@Setter
public abstract class User {
    @Id
    private String clientId;
    protected String name;
    protected String lastname;
    protected String typeOfId;
    protected String idNumber;
    protected String country;
    protected String phone;
    protected String email;
    protected String password;
    protected List<Invoice> invoices;

}
