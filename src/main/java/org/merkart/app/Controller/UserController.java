package org.merkart.app.Controller;

import org.merkart.app.Service.UserService;
import org.merkart.app.repository.Document.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/client")
public class UserController {

    private final UserService userService;

    public UserController(@Autowired UserService userService){
        this.userService = userService;
    }

    @GetMapping("/purchasedProducts")
    public List<Invoice> getPurchasedProducts(String clientId){
        return userService.getPurchasedProducts(clientId);
    }
}
