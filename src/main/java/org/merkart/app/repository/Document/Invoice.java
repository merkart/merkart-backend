package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Document
public class Invoice {

    @Id
    private String id;
    private String clientId;
    private Date currentDate;
    private List<Product> shoppingCart;
    private int subtotal;
    private int iva;
    private int total;
}
