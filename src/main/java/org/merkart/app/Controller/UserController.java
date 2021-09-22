package org.merkart.app.Controller;

import org.merkart.app.Service.UserService;
import org.merkart.app.repository.Document.Invoice;
import org.merkart.app.repository.Document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable String productId){
        return userService.findProductById(productId);
    }

    @GetMapping("/purchasedProducts")
    public List<Invoice> getPurchasedProducts(String clientId){
        return userService.getPurchasedProducts(clientId);
    }

    @PutMapping("/purchaseProducts")
    public Invoice purchaseProducts(@RequestParam String clientId,@RequestBody List<Product> selectedProducts){
        return userService.insertInvoice(clientId,selectedProducts);
    }
}
