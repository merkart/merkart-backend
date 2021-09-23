package org.merkart.app.repository.document;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {
    List<Product> findProductsByArtisanId(String artisanId);
    Product findProductByArtisanId(String productId, String artisanId);
    List<Product> findProductsByArtisanIdOrderByCost(String artisanId);
}
