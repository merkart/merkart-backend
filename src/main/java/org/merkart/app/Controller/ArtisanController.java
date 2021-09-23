package org.merkart.app.Controller;
import org.merkart.app.Controller.Dto.ArtisanDto;
import org.merkart.app.Controller.Dto.UserDto;
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
    @PostMapping
    public ResponseEntity<Artisan> insertArtisan(@RequestBody ArtisanDto artisanDto){
        return ResponseEntity.ok(artisanService.insertArtisan(new Artisan(artisanDto)));
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
}