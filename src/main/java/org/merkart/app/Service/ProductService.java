package org.merkart.app.Service;

import org.merkart.app.Controller.Dto.ProductDto;
import org.merkart.app.repository.Document.Product;

import java.util.List;

public interface ProductService{
    Product insertProduct(ProductDto productDto);

    List<Product> allProducts();

    Product findById(String id);

    Product selectProduct(String productId);
}
