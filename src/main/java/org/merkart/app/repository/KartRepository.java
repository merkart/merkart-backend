package org.merkart.app.repository;

import org.merkart.app.repository.documents.Kart;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KartRepository extends MongoRepository<Kart, String> {
	
	

}
