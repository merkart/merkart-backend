package org.merkart.app.repository;

import org.merkart.app.repository.document.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    Product findByname(String name);

    List<Product> findByNameContains(String name);
}
