package org.merkart.app.Service;

import org.merkart.app.repository.Document.Artisan;

import java.util.List;

public interface ArtisanService {
    Artisan findById(String id);
    Artisan findByName(String name);
    List<Artisan> findByNameContains(String name);
    List<Artisan> all();
}
