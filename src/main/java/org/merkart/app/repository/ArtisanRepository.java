package org.merkart.app.repository;

import org.merkart.app.repository.documents.Artisan;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ArtisanRepository extends MongoRepository<Artisan, String> {
    Artisan findByname(String name);
    List<Artisan> findByNameContains(String name);
}