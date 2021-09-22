package org.merkart.app.Service;

import org.merkart.app.repository.Document.Invoice;
import org.merkart.app.repository.Document.Product;

import java.util.List;

public interface UserService {
    List<Invoice> getPurchasedProducts(String clientId);

    Invoice insertInvoice(String clientId,List<Product> products);

    Product findProductById(String productId);
}
