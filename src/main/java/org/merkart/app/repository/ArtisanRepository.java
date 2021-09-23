package org.merkart.app.repository;

import org.merkart.app.repository.document.Artisan;
import org.merkart.app.repository.document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArtisanRepository extends MongoRepository<Artisan, String> {
}
