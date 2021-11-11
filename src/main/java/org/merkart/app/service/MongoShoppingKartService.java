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
		var kart = kartRepo.findById(clientId)
				.orElseThrow();
		kart.getProducts().clear();
		kartRepo.save(kart);
		return true;		
	}

	@Override
	public boolean deleteQuantity(String clientId, String prouctId, int quantity) {
		var kart = kartRepo.findById(clientId)
				.orElseThrow();
		kart.getProducts()
			.stream()
			.forEach((product) -> {
				if (product.getId().equals(prouctId)) {
					product.setQuantity((int) Math.max(0, product.getQuantity()-quantity));
				}
			});
		kart.getProducts()
			.stream()
			.filter((product) -> {
				return product.getQuantity() == 0;
			});
		kartRepo.save(kart);
		return true;
	}

	@Override
	public boolean deleteAll(String clientId) {
		kartRepo.deleteById(clientId);
		return true;
	}

}
