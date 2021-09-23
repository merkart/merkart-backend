package org.merkart.app.controller.Dto;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.repository.document.Product;

import java.util.List;

@Getter
@Setter
public class ArtisanDto {
    private String name;
    private String lastname;
    private String typeOfId;
    private String idNumber;
    private String country;
    private String phone;
    private String email;
    private String password;
    private List<Product> productList;

}
