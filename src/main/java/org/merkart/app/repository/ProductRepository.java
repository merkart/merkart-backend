package org.merkart.app.repository.Document;

import org.merkart.app.repository.document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
