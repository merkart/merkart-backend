package org.merkart.app.service;

import org.merkart.app.repository.ArtisanRepository;
import org.merkart.app.repository.document.Artisan;
import org.merkart.app.repository.document.Product;
import org.merkart.app.repository.document.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoArtisanService implements ArtisanService {

    private final ArtisanRepository artisanRepository;
    private final ProductRepository productRepository;

    public MongoArtisanService(@Autowired ProductRepository productRepository, @Autowired ArtisanRepository artisanRepository) {
        this.productRepository = productRepository;
        this.artisanRepository = artisanRepository;
    }
    @Override
    public Product insertProduct(String artisanId, Product product){
        Optional<Artisan> optionalArtisan = artisanRepository.findById(artisanId);
        if (optionalArtisan.isPresent()){
            Artisan artisan = optionalArtisan.get();
            artisan.getProductList().add(product);
            artisanRepository.save(artisan);
            productRepository.save(product);
            return product;
        }
        return null;
    }

    @Override
    public List<Product> allProductByArtisanId(String artistanId){

        return productRepository.findProductsByArtisanId(artistanId);
    }
    @Override
    public List<Product> findProductsByArtisanIdOrderByCost(String artistanId){

        return productRepository.findProductsByArtisanIdOrderByCost(artistanId);
    }

    @Override
    public Product updateProductById(String productId, Product productUpdate) {
        if (productRepository.existsById(productId)){
            Product selectedProduct=productRepository.findById(productId).get();
            selectedProduct.update(productUpdate);
            productRepository.save(selectedProduct);
            return selectedProduct;

        }
        return null;
    }

    @Override
    public Product findProductById(String productId, String artisanId) {
        return productRepository.findProductByArtisanId(productId,artisanId);
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
