package org.merkart.app.Controller;

import org.merkart.app.Controller.Dto.ProductDto;
import org.merkart.app.Service.ArtisanService;
import org.merkart.app.repository.Document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ArtisanController {

    private final ArtisanService artisanService;

    public ArtisanController(@Autowired ArtisanService artisanService) {

        this.artisanService = artisanService;
    }
    @PostMapping
    public  Product insertProduct(@RequestBody ProductDto productDto){

        return artisanService.insertProduct(new Product(productDto));
    }
    @GetMapping("/{MyProducts}")
    public List<Product> getMyProducts(String artistanId)
    {
        return artisanService.allProductByArtisanId(artistanId);
    }
    @GetMapping("/{MyProductsOrderByValue}")
    public List<Product> getMyProductsOrderByValue(String artistanId)
    {
        return artisanService.findProductsByArtisanIdOrderByCost(artistanId);
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable String productId){

        return artisanService.findById(productId);
    }

    @PutMapping("/{productId}")
    public Product selectProduct(@PathVariable String productId){

        return artisanService.selectProduct(productId);
    }
    @PutMapping( "/{id}" )
    public Product UpdateProductById(String productId , @RequestBody ProductDto productUpdateDto )
    {
        return artisanService.updateProductById(productId,new Product(productUpdateDto));
    }
}
