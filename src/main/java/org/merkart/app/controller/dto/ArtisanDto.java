package org.merkart.app.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.repository.document.Product;

import java.util.List;

@Getter
@Setter
public class ArtisanDto extends UserDto{

    private List<Product> productList;

    public ArtisanDto() {
        super();
    }
}
