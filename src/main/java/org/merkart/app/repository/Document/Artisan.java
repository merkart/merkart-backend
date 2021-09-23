package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.Controller.Dto.ArtisanDto;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
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
