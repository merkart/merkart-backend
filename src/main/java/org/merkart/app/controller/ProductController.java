package org.merkart.app.controller;

import org.merkart.app.service.ProductService;

import org.merkart.app.repository.document.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(@Autowired ProductService productService) {
        this.productService = productService;
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
