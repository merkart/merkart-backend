package org.merkart.app.controller;

import org.merkart.app.controller.dto.ProductDto;
import org.merkart.app.service.ArtisanService;
import org.merkart.app.repository.document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artisan")
public class ArtisanController {

    private final ArtisanService artisanService;

    public ArtisanController(@Autowired ArtisanService artisanService) {

        this.artisanService = artisanService;
    }
    @PostMapping("/{artisanId}")
    public  Product insertProduct(@PathVariable String artisanId,@RequestBody ProductDto productDto){

        return artisanService.insertProduct(artisanId,new Product(productDto));
    }
    @GetMapping("/{MyProducts}")
    public List<Product> getMyProducts(@PathVariable String artistanId)
    {
        return artisanService.allProductByArtisanId(artistanId);
    }
    @GetMapping("/orderedProducts/{artisanId}")
    public List<Product> getMyProductsOrderByValue(@PathVariable String artistanId)
    {
        return artisanService.findProductsByArtisanIdOrderByCost(artistanId);
    }

    @GetMapping("/{artisanId}")
    public Product getProductById( @RequestParam String productId, @PathVariable String artisanId){

        return artisanService.findProductById(productId,artisanId);
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
