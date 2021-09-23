package org.merkart.app.service;

import org.merkart.app.repository.document.Product;

import java.util.List;

public interface ArtisanService {
    Product insertProduct(String artisanId, Product productDto);

    List<Product> allProductByArtisanId(String artistanId);

    List<Product> findProductsByArtisanIdOrderByCost(String artistanId);

    Product updateProductById(String productId,Product productUpdate);

    Product findProductById(String productId, String id);

    Product selectProduct(String productId);
}
