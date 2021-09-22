package org.merkart.app.Controller;

import org.merkart.app.Service.ProductService;
import org.merkart.app.repository.Document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(@Autowired ProductService productService) {
        this.productService = productService;
    }


}
