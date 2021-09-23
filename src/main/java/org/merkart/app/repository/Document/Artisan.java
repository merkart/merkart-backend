package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.Controller.Dto.ArtisanDto;
import org.merkart.app.Controller.Dto.UserDto;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Artisan extends User {

    private List<Product> productList;

    public Artisan(UserDto userDto) {
        super(userDto);
        productList = new ArrayList<>();
    }
}
