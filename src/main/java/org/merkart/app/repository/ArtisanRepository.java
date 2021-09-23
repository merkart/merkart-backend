package org.merkart.app.repository;

import org.merkart.app.repository.Document.Artisan;
import org.merkart.app.repository.Document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ArtisanRepository extends MongoRepository<Artisan, String> {
    Artisan findByname(String name);
    List<Artisan> findByNameContains(String name);
}