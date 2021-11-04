package org.merkart.app.service;

import java.util.List;

import org.merkart.app.repository.documents.Product;
import org.springframework.stereotype.Service;

@Service
public class MongoShoppingKartService implements ShoppingKartService {

	public MongoShoppingKartService() {
		
	}

	@Override
	public List<Product> getShoppingKart(String cliendId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addProduct(String clientId, Product product) {
		// TODO Auto-generated method stub
		return false;
	}

}
