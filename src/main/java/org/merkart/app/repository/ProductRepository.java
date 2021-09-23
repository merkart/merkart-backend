package org.merkart.app.repository.Document;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findProductsByArtisanId(String artisanId);
    List<Product> findProductsByArtisanIdOrderByCost(String artisanId);
}
