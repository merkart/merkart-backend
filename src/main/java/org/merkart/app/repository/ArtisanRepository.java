package org.merkart.app.repository;

import org.merkart.app.repository.Document.Artisan;
import org.merkart.app.repository.Document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtisanRepository extends MongoRepository<Artisan, String> {
}