package org.merkart.app.Service;

import org.merkart.app.repository.Document.Invoice;

import java.util.List;

public interface UserService {
    List<Invoice> getPurchasedProducts(String clientId);
}
