package org.merkart.app.service;

import org.merkart.app.repository.document.Product;

public interface ProductService{
    Product findById(String id);

    Product selectProduct(String productId);
}
