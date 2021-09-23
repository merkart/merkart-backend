package org.merkart.app.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.repository.document.Invoice;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private String name;
    private String lastname;
    private String typeOfId;
    private String idNumber;
    private String country;
    private String phone;
    private String email;
    private String password;
    private List<Invoice> invoices;
}
