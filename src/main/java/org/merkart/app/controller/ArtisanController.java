package org.merkart.app.controller;

import org.merkart.app.controller.dto.ArtisanDto;
import org.merkart.app.controller.dto.ProductDto;
import org.merkart.app.service.ArtisanService;
import org.merkart.app.repository.documents.Artisan;
import org.merkart.app.repository.documents.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artisan")
public class ArtisanController {

    private final ArtisanService artisanService;
    public ArtisanController(@Autowired ArtisanService artisanService) {
        this.artisanService = artisanService;
    }
    @GetMapping
    public ResponseEntity<List<Artisan>> all()
    {
        return ResponseEntity.ok( artisanService.all() );
    }
    @GetMapping("/{artisanId}")
    public Artisan getArtisanById(@PathVariable String artisanId){
        return artisanService.findById(artisanId);
    }
    @GetMapping("/name/{artisanName}")
    public Artisan getArtisanByName(@PathVariable String artisanName){
        return artisanService.findByName(artisanName);
    }
    @GetMapping("/name/search/{artisanName}")
    public List<Artisan> getArtisanByNameContains(@PathVariable String artisanName){
        return artisanService.findByNameContains(artisanName);
    }

    @PostMapping
    public ResponseEntity<Artisan> createArtisan(@RequestBody ArtisanDto artisanDto){
        return ResponseEntity.ok(artisanService.create(new Artisan(artisanDto)));
    }

    @PostMapping("/product/insert/{artisanId}")
    public  Product insertProduct(@PathVariable String artisanId,@RequestBody ProductDto productDto){

        return artisanService.insertProduct(artisanId,new Product(productDto));
    }

    @GetMapping("/product/all/{artisanId}")
    public List<Product> getMyProducts(@PathVariable String artisanId)
    {
        return artisanService.allProductsByArtisanId(artisanId);
    }

    @GetMapping("/product/all/{artisanId}/cost-order")
    public List<Product> getMyProductsOrderByValue(@PathVariable String artisanId)
    {
        return artisanService.findProductsByArtisanIdOrderByCost(artisanId);
    }

    @GetMapping("/product/{artisanId}/{productId}")
    public Product getProductById( @PathVariable String productId, @PathVariable String artisanId){

        return artisanService.findProductById(productId,artisanId);
    }

    @PutMapping("/product/{productId}")
    public Product selectProduct(@PathVariable String productId){

        return artisanService.selectProduct(productId);
    }

    @PutMapping( "/{artisanId}" )
    public Product UpdateProductById(@PathVariable String artisanId , @RequestBody ProductDto productUpdateDto )
    {
        return artisanService.updateProductById(artisanId,new Product(productUpdateDto));
    }
    
    @DeleteMapping("/{artisanId}/{productId}")
    public ResponseEntity<?> deleteProduct(@PathVariable String artisanId, @PathVariable String productId) {
    	try {
    		return ResponseEntity.ok()
    				.body(artisanService.deleteProduct(artisanId, productId));
    	} catch (Exception ex) {
    		return ResponseEntity.internalServerError().build();
    	}
    }
    
    
    
}