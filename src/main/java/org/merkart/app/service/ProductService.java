package org.merkart.app.service;

import org.merkart.app.repository.documents.Product;

import java.util.List;

import java.util.List;

public interface ProductService{
    Product findById(String id);
    Product findByName(String name);
    List<Product> findByNameContains(String name);
    List<Product> all();
    Product selectProduct(String productId);
   
    List<Product> getProductsByCategory(String categoryId);

}
