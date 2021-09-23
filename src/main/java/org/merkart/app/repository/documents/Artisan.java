package org.merkart.app.repository.documents;

import lombok.Getter;
import lombok.Setter;



import org.merkart.app.controller.dto.ArtisanDto;

import java.util.ArrayList;


import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;

@Getter
@Setter
@Document
public class Artisan extends User {

    private List<Product> productList;

    public Artisan() {
        super();

        this.productList = new ArrayList<>();
    }

    public Artisan(ArtisanDto artisanDto) {
        super();
        this.name = artisanDto.getName();
        this.lastname = artisanDto.getLastname();
        this.idNumber = artisanDto.getIdNumber();
        this.typeOfId = artisanDto.getTypeOfId();
        this.phone = artisanDto.getPhone();
        this.country = artisanDto.getCountry();
        this.password =artisanDto.getPassword();
        this.email = artisanDto.getEmail();
        this.productList = artisanDto.getProductList();


    }
}
