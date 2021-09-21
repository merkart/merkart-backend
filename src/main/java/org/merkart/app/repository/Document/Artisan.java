package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Artisan extends User {

    private List<Product> productList;

    public Artisan() {
        super();
    }
}
