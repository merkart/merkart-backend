package org.merkart.app.Service;

import org.merkart.app.repository.Document.Product;

import java.util.List;

public interface ProductService{
    Product findById(String id);
    List<Product> all();
    Product selectProduct(String productId);
}
