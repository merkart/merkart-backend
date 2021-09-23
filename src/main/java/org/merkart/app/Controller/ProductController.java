package org.merkart.app.Controller;

import org.merkart.app.Controller.Dto.ProductDto;
import org.merkart.app.Service.ProductService;
import org.merkart.app.repository.Document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(@Autowired ProductService productService) {

        this.productService = productService;
    }
    @PostMapping
    public  Product insertProduct(@RequestBody ProductDto productDto){

        return productService.insertProduct(productDto);
    }
    @GetMapping("/{MyProducts}")
    public List<Product> getMyProducts(String artistanId)
    {
        return productService.allProductByArtisanId(artistanId);
    }
    @GetMapping("/{MyProducts}")
    public List<Product> getMyProductsOrderByValue(String artistanId)
    {
        return productService.findProductsByArtisanIdOrderByCost(artistanId);
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
