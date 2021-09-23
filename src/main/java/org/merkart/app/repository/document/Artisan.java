package org.merkart.app.repository.document;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Artisan extends User {

    private List<Product> productList = new ArrayList<>();

    public Artisan() {
        super();
    }
}
