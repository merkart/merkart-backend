package org.merkart.app.Service;

import org.merkart.app.repository.Document.Product;

public interface ProductService{
    Product findById(String id);

    Product selectProduct(String productId);
}
