package org.merkart.app.Service;

import org.merkart.app.Controller.Dto.ProductDto;
import org.merkart.app.repository.Document.Product;

public interface ProductService{
    Product insertProduct(ProductDto productDto);

    Product findById(String id);

    Product selectProduct(String productId);
}
