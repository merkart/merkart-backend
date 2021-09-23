package org.merkart.app.Controller.Dto;

import org.merkart.app.repository.Document.Invoice;

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
