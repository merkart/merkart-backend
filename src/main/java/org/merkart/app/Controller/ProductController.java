package org.merkart.app.Controller;

import org.merkart.app.Service.ProductService;
import org.merkart.app.repository.Document.Product;
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
    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable String productId){
        return productService.findById(productId);
    }

    @PutMapping("/{productId}")
    public Product selectProduct(@PathVariable String productId){
        return productService.selectProduct(productId);
    }
}
