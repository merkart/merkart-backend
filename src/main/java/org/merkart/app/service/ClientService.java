package org.merkart.app.service;

import org.merkart.app.repository.Document.Client;
import org.merkart.app.repository.Document.Invoice;
import org.merkart.app.repository.Document.Product;

import java.util.List;

public interface ClientService {
    List<Invoice> getPurchasedProducts(String clientId);

    Invoice insertInvoice(String clientId,List<Product> products);

    Product findProductById(String productId);

    Client createClient(Client client);
}
