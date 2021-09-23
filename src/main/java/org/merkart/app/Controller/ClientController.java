package org.merkart.app.Controller;

import org.merkart.app.Controller.Dto.ClientDto;
import org.merkart.app.Service.ClientService;
import org.merkart.app.repository.Document.Client;
import org.merkart.app.repository.Document.Invoice;
import org.merkart.app.repository.Document.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(@Autowired ClientService clientService){
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client clientDto){
        return ResponseEntity.ok(clientService.createClient(new Client(clientDto)));
    }

    @GetMapping("/{productId}")
    public Product getProductById(@PathVariable String productId){
        return clientService.findProductById(productId);
    }

    //TODO: falla el metodo
    @GetMapping("/purchasedProducts")
    public List<Invoice> getPurchasedProducts(@RequestParam String clientId){
        return clientService.getPurchasedProducts(clientId);
    }

    @PutMapping("/purchaseProducts")
    public Invoice purchaseProducts(@RequestParam String clientId,@RequestBody List<Product> selectedProducts){
        return clientService.insertInvoice(clientId,selectedProducts);
    }
}