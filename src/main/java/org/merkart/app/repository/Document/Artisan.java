package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document
public class Artisan extends User {

    private List<Product> productList;

    public Artisan() {
        super();
    }
}
