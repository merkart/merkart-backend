package org.merkart.app.controller.dto;

import org.merkart.app.repository.document.Invoice;

import java.util.List;

public class UserDto {
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
