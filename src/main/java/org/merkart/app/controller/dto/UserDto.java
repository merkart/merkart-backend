package org.merkart.app.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.repository.documents.Invoice;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private String name;
    private String lastName;
    private String email;
    private String password;
    private List<Invoice> invoices;
}
