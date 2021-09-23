package org.merkart.app.repository.documents;

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

    private double total;

    public Invoice(String clientId, List<Product> products) {
        this.clientId = clientId;
        this.currentDate = new Date();
        this.shoppingCart = products;
        this.total = calculateTotal(products);
    }

    private int calculateTotal(List<Product> products){
        int subtotal = 0;
        for (Product product: products) {
            subtotal += product.getCost();
        }
        return subtotal;
    }



}
