package org.merkart.app.Service;

import org.merkart.app.repository.ArtisanRepository;
import org.merkart.app.repository.Document.Artisan;
import org.merkart.app.repository.Document.Product;
import org.merkart.app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MongoArtisanService implements ArtisanService {

    private final ArtisanRepository artisanRepository;
    private final ProductRepository productRepository;

    public MongoArtisanService(@Autowired ArtisanRepository artisanRepository, @Autowired ProductRepository productRepository) {
        this.artisanRepository = artisanRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Artisan findById(String id) {
        Optional<Artisan> optionalArtisan = artisanRepository.findById(id);
        if (optionalArtisan.isPresent()) {
            return optionalArtisan.get();
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public List<Artisan> findByNameContains(String name) {
        return new ArrayList<>(artisanRepository.findByNameContains(name));
    }

    @Override
    public Artisan findByName(String name) {
        return artisanRepository.findByname(name);
    }

    @Override
    public List<Artisan> all() {
        return new ArrayList<>(artisanRepository.findAll());
    }

    @Override
    public Artisan create(Artisan artisan) {
        return artisanRepository.save(artisan);
    }

    @Override
    public Product insertProduct(String artisanId, Product product) {
        Optional<Artisan> optionalArtisan = artisanRepository.findById(artisanId);
        if (optionalArtisan.isPresent()) {
            Artisan artisan = optionalArtisan.get();
            Product savedProduct = productRepository.save(product);
            artisan.getProductList().add(savedProduct);
            artisanRepository.save(artisan);
            return product;
        }
        return null;
    }

    @Override
    public List<Product> allProductsByArtisanId(String artistanId) {
        return productRepository.findProductsByArtisanId(artistanId);
    }

    @Override
    public List<Product> findProductsByArtisanIdOrderByCost(String artistanId) {
        return productRepository.findProductsByArtisanIdOrderByCost(artistanId);
    }

    //TODO:Metodo defecutoso porfa revisar
    @Override
    public Product findProductById(String productId, String artisanId) {
        return productRepository.findProductByArtisanId(productId, artisanId);
    }

    //TODO: se necesita el metodo findProductById ya que se debe actualizar tambien en la lista del artesano
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

    //TODO: no esta probado
    @Override
    public Product updateProductById(String artisanId, Product product) {
        if (productRepository.existsById(product.getId())){
            Product selectedProduct=productRepository.findById(product.getId()).get();
            selectedProduct.update(product);
            productRepository.save(selectedProduct);
            return selectedProduct;
        }
        return null;
    }


}
