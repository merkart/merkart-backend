package org.merkart.app.service;

import java.util.Iterator;
import java.util.List;

import org.merkart.app.repository.KartRepository;
import org.merkart.app.repository.documents.Kart;
import org.merkart.app.repository.documents.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MongoShoppingKartService implements ShoppingKartService {
	
	private KartRepository kartRepo;

	@Autowired
	public MongoShoppingKartService(KartRepository kartRepo) {
		this.kartRepo = kartRepo;
	}

	@Override
	public List<Product> getShoppingKart(String clientId) {
		return kartRepo.findById(clientId)
				.orElseThrow()
				.getProducts();
	}

	@Override
	public void addProduct(String clientId, Product product) {
		Kart kart = kartRepo.findById(clientId)
				.orElse(new Kart());
		List<Product> products = kart.getProducts();
		
		Iterator<Product> it = products.iterator();
		Product aux = null;
		while (it.hasNext()) {
			aux = it.next();
			if (aux.getId().equals(product.getId())) {
				aux.setQuantity(aux.getQuantity()+1);
				break;
			}
		}
		if (!it.hasNext()) {
			products.add(product);
		}
		
		kart.setProducts(products);
		kartRepo.save(kart);
	}

	@Override
	public boolean deleteAll(String clientId, String productId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteQuantity(String clientId, String prouctId, int quentity) {
		// TODO Auto-generated method stub
		return false;
	}

}
