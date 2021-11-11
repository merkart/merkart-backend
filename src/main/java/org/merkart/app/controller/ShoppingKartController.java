package org.merkart.app.controller;

import org.merkart.app.controller.dto.ProductDto;
import org.merkart.app.repository.documents.Product;
import org.merkart.app.service.ShoppingKartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping-kart")
public class ShoppingKartController {
	
	private ShoppingKartService shoppingKartService;

	@Autowired
	public ShoppingKartController(ShoppingKartService shoppingKartService) {
		this.shoppingKartService = shoppingKartService;
	}
	
	@GetMapping()
	public ResponseEntity<?> shoppingHome(){
		try {
			return ResponseEntity.ok()
					.body("Servicio de carrito de compras - MerKART");
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	
	@GetMapping("/{clientId}")
	public ResponseEntity<?> getShoppingKart(@PathVariable String clientId){
		try {
			return ResponseEntity.ok()
					.body(shoppingKartService.getShoppingKart(clientId));
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@PutMapping("/{clientId}")
	public ResponseEntity<?> addProduct(@PathVariable String clientId, @RequestBody ProductDto productDto) {
		try {
			shoppingKartService.addProduct(clientId, new Product(productDto));
			return ResponseEntity.accepted().build();
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@DeleteMapping("/{clientId}/{productId}/all")
	public ResponseEntity<?> deleteProduct(@PathVariable String clientId, @PathVariable String productId) {
		try {
			return ResponseEntity.accepted()
					.body(shoppingKartService.deleteAll(clientId, productId));
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@DeleteMapping("/{clientId}")
	public ResponseEntity<?> deleteKart(@PathVariable String clientId) {
		try {
			return ResponseEntity.accepted()
			.body(shoppingKartService.deleteAll(clientId));
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@DeleteMapping("/{clientId}/{productId}/{quantity}")
	public ResponseEntity<?> deleteProductQuantity(@PathVariable String clientId, @PathVariable String productId, @PathVariable int quantity) {
		try {
			return ResponseEntity.accepted()
					.body(shoppingKartService.deleteQuantity(clientId, productId, quantity));
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}

}
