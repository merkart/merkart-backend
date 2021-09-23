package org.merkart.app.repository;

import org.merkart.app.repository.Document.Product;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
    Product findByname(String name);
}
