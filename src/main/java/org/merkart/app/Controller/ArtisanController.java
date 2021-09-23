package org.merkart.app.Controller;

import org.merkart.app.Controller.Dto.ArtisanDto;
import org.merkart.app.Controller.Dto.ProductDto;
import org.merkart.app.Service.ArtisanService;
import org.merkart.app.Service.ProductService;
import org.merkart.app.repository.Document.Artisan;
import org.merkart.app.repository.Document.Product;
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
    @GetMapping("/namecontains/{artisanName}")
    public List<Artisan> getArtisanByNameContains(@PathVariable String artisanName){
        return artisanService.findByNameContains(artisanName);
    }

    @PostMapping
    public ResponseEntity<Artisan> createArtisan(@RequestBody ArtisanDto artisanDto){
        return ResponseEntity.ok(artisanService.create(new Artisan(artisanDto)));
    }

    @PostMapping("/insertproduct/{artisanId}")
    public  Product insertProduct(@PathVariable String artisanId,@RequestBody ProductDto productDto){

        return artisanService.insertProduct(artisanId,new Product(productDto));
    }

    @GetMapping("/myProducts/{artisanId}")
    public List<Product> getMyProducts(@PathVariable String artisanId)
    {
        return artisanService.allProductsByArtisanId(artisanId);
    }

    @GetMapping("/orderedProductsByCost/{artisanId}")
    public List<Product> getMyProductsOrderByValue(@PathVariable String artisanId)
    {
        return artisanService.findProductsByArtisanIdOrderByCost(artisanId);
    }

    @GetMapping("/myProduct/{artisanId}")
    public Product getProductById( @RequestParam String productId, @PathVariable String artisanId){

        return artisanService.findProductById(productId,artisanId);
    }

    @PutMapping("/{productId}")
    public Product selectProduct(@PathVariable String productId){

        return artisanService.selectProduct(productId);
    }

    @PutMapping( "/{artisanId}" )
    public Product UpdateProductById(@PathVariable String artisanId , @RequestBody ProductDto productUpdateDto )
    {
        return artisanService.updateProductById(artisanId,new Product(productUpdateDto));
    }
}