package org.merkart.app.repository.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Getter
@Setter
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
