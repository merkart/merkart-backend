package org.merkart.app.Controller;
import org.merkart.app.Service.ArtisanService;
import org.merkart.app.Service.ProductService;
import org.merkart.app.repository.Document.Artisan;
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

}