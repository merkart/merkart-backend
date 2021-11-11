package org.merkart.app.service;

import java.util.List;

import org.merkart.app.repository.documents.Product;

public interface ShoppingKartService {

	List<Product> getShoppingKart(String cliendId);
	void addProduct(String clientId, Product product);
	boolean deleteAll(String clientId, String productId);
	boolean deleteAll(String clientId);
	boolean deleteQuantity(String clientId, String prouctId, int quentity);

}
