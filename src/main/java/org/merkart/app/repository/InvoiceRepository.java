package org.merkart.app.repository;

import org.merkart.app.repository.Document.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {
    List<Invoice> findInvoicesByClientId(String clientId);
}
