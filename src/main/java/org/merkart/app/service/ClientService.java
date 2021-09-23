package org.merkart.app.service;

import org.merkart.app.repository.document.Client;
import org.merkart.app.repository.document.Invoice;
import org.merkart.app.repository.document.Product;

import java.util.List;

public interface ClientService {
    List<Invoice> getPurchasedProducts(String clientId);

    Invoice insertInvoice(String clientId,List<Product> products);

    Product findProductById(String productId);

    Client createClient(Client client);
}
