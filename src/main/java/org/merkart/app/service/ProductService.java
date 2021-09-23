package org.merkart.app.service;

import org.merkart.app.repository.Document.Product;

public interface ProductService{
    Product findById(String id);

    Product selectProduct(String productId);
}
