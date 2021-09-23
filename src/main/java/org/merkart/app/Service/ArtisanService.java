package org.merkart.app.Service;

import org.merkart.app.repository.Document.Artisan;
import org.merkart.app.repository.Document.Product;

import java.util.List;

public interface ArtisanService {
    Artisan findById(String id);
    Artisan findByName(String name);
    List<Artisan> findByNameContains(String name);
    List<Artisan> all();
    Artisan create(Artisan artisan);
    Product insertProduct(String artisanId, Product product);
    List<Product> allProductsByArtisanId(String artistanId);
    List<Product> findProductsByArtisanIdOrderByCost(String artistanId);
    Product findProductById(String productId, String artisanId);
    Product selectProduct(String productId);
    Product updateProductById(String artisanId, Product product);
}
