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
        setName(artisanDto.getName());
        setLastName(artisanDto.getLastName());
        setIdNumber(artisanDto.getIdNumber());
        setTypeOfId(artisanDto.getTypeOfId());
        setPhone(artisanDto.getPhone());
        setCountry(artisanDto.getCountry());
        setPassword(artisanDto.getPassword());
        setEmail(artisanDto.getEmail());
        this.productList = artisanDto.getProductList();


    }
}
