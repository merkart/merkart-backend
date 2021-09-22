package org.merkart.app.Service;

import org.merkart.app.repository.Document.Product;
import org.merkart.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
public class MongoProductService implements ProductService {

    private final ProductRepository productRepository;

    public MongoProductService(@Autowired ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> all()
    {
        return new ArrayList<>( productRepository.findAll() );
    }

    @Override
    public Product findById(String id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }else {
            throw new RuntimeException();
        }
    }

    @Override
    public Product selectProduct(String productId) {
        if(productRepository.existsById(productId)){
            Product product = productRepository.findById(productId).get();
            product.setSelected(true);
            productRepository.save(product);
            return product;
        }
        return null;
    }
}
