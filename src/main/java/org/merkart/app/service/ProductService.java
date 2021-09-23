package org.merkart.app.service;

import org.merkart.app.repository.document.Product;

import java.util.List;

public interface ProductService{
    Product findById(String id);

    Product selectProduct(String productId);

    List<Product> getAll();
    List<Product> getProductsByCategory(String categoryId);
}
