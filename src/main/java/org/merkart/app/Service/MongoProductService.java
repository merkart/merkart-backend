package org.merkart.app.Service;

import org.merkart.app.Controller.Dto.ProductDto;
import org.merkart.app.Util.ProductMap;
import org.merkart.app.repository.Document.Product;
import org.merkart.app.repository.Document.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoProductService implements ProductService {

    private final ProductRepository productRepository;

    public MongoProductService(@Autowired ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public Product insertProduct(ProductDto productDto){
        return productRepository.save(ProductMap.doProduct(productDto));
    }

    @Override
    public List<Product> allProductByArtisanId(String artistanId){

        return productRepository.findProductsByArtisanId(artistanId);
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
