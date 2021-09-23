package org.merkart.app.controller;

import org.merkart.app.service.ProductService;
import org.merkart.app.repository.document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;
    @GetMapping
    public ResponseEntity<List<Product>> all()
    {
        return ResponseEntity.ok( productService.all() );
    }

    public ProductController(@Autowired ProductService productService) {
        this.productService = productService;
    }
    @GetMapping("/name/{productName}")
    public Product getProductByName(@PathVariable String productName){
        return productService.findByName(productName);
    }
    @GetMapping("/namecontains/{productName}")
    public List<Product> getProductByNameContains(@PathVariable String productName){
        return productService.findByNameContains(productName);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable String productId){
        return productService.findById(productId);
    }

    @PutMapping("/{productId}")
    public Product selectProduct(@PathVariable String productId){
        return productService.selectProduct(productId);
    }
}
