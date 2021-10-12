package org.merkart.app.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.repository.documents.Product;

import java.util.List;

@Getter
@Setter
public class ArtisanDto extends UserDto{

    private List<Product> productList;

    public ArtisanDto() {
        super();
    }
}
