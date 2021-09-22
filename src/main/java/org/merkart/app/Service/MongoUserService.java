package org.merkart.app.Service;

import org.merkart.app.repository.Document.Invoice;
import org.merkart.app.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoUserService implements UserService{

    private final InvoiceRepository invoiceRepository;

    public MongoUserService(@Autowired InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public List<Invoice> getPurchasedProducts(String clientId) {
        return invoiceRepository.findInvoicesByClientId(clientId);
    }
}
