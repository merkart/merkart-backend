package org.merkart.app.repository;

import org.merkart.app.repository.documents.Category;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("Mongo")
public interface MongoCategoryRepository extends MongoRepository<Category, String> {

}
