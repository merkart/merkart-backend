package org.merkart.app.repository;

import org.merkart.app.repository.document.Invoice;
import org.merkart.app.repository.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<Invoice> findInvoicesByClientId(String clientId);
}
