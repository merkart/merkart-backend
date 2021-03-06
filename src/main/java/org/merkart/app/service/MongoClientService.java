package org.merkart.app.service;

import org.merkart.app.repository.documents.Client;
import org.merkart.app.repository.documents.Invoice;
import org.merkart.app.repository.documents.Product;
import org.merkart.app.repository.documents.User;
import org.merkart.app.repository.ProductRepository;
import org.merkart.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MongoClientService implements ClientService {

    private final UserRepository userRepository;
    private final ProductRepository productRepository;

    public MongoClientService(@Autowired UserRepository userRepository, @Autowired ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.productRepository = productRepository;
    }

    @Override
    public List<Invoice> getPurchasedProducts(String clientId) {
        return userRepository.findInvoicesById(clientId);
    }

    @Override
    public Invoice insertInvoice(String clientId, List<Product> products) {
        if (userRepository.existsById(clientId)) {
            User client = userRepository.findById(clientId).get();
            Invoice invoice = new Invoice(clientId, products);
            client.getInvoices().add(invoice);
            userRepository.save(client);
            updateQuantityProducts(products);
            return invoice;
        }
        return null;
    }

    @Override
    public Product findProductById(String productId) {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if(optionalProduct.isPresent()){
            return optionalProduct.get();
        }else {
            throw new RuntimeException();
        }
    }

    @Override
    public Client createClient(Client client) {
        return userRepository.save(client);
    }

    private void updateQuantityProducts(List<Product> products) {
        for (Product product : products) {
            if (productRepository.existsById(product.getId())){
                Product selectedProduct = productRepository.findById(product.getId()).get();
                selectedProduct.setQuantity(selectedProduct.getQuantity()-1);
                productRepository.save(selectedProduct);
            }
        }
    }
}
