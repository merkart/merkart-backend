package org.merkart.app.service;

import java.util.List;

import org.merkart.app.repository.documents.Product;

public interface ShoppingKartService {

	List<Product> getShoppingKart(String cliendId);
	boolean addProduct(String clientId, Product product);

}
