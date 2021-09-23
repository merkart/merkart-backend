package org.merkart.app.Service;

import org.merkart.app.repository.Document.Product;

import java.util.List;

public interface ArtisanService {
    Product insertProduct(Product productDto);

    List<Product> allProductByArtisanId(String artistanId);

    List<Product> findProductsByArtisanIdOrderByCost(String artistanId);

    Product updateProductById(String productId,Product productUpdate);

    Product findById(String id);

    Product selectProduct(String productId);
}
