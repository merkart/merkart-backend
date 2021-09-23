package org.merkart.app.repository;

import org.merkart.app.repository.documents.Invoice;
import org.merkart.app.repository.documents.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository
        extends MongoRepository<User, String>
{
    Optional<User> findByEmail( String email );
    List<Invoice> findInvoicesById(String clientId);
}
