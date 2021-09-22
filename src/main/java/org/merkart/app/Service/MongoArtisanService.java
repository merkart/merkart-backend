package org.merkart.app.Service;

import org.merkart.app.repository.ArtisanRepository;
import org.merkart.app.repository.Document.Artisan;
import org.merkart.app.repository.Document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MongoArtisanService implements ArtisanService {

    private final ArtisanRepository artisanRepository;

    public MongoArtisanService(@Autowired ArtisanRepository artisanRepository) {
        this.artisanRepository = artisanRepository;
    }
    @Override
    public Artisan findById(String id) {
        Optional<Artisan> optionalArtisan = artisanRepository.findById(id);
        if(optionalArtisan.isPresent()){
            return optionalArtisan.get();
        }else {
            throw new RuntimeException();
        }
    }
    @Override
    public List<Artisan> all()
    {
        return new ArrayList<>(artisanRepository.findAll() );
    }
}
