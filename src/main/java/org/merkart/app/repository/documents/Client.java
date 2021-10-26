package org.merkart.app.repository.documents;

import lombok.Getter;
import lombok.Setter;


import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document
public class Client extends User {
    public Client() {
        super();
    }

    public Client(Client clientDto) {
        super();
        setName(clientDto.getName());
        setLastName(clientDto.getLastName());
        setIdNumber(clientDto.getIdNumber());
        setTypeOfId(clientDto.getTypeOfId());
        setPhone(clientDto.getPhone());
        setCountry(clientDto.getCountry());
        setPassword(clientDto.getPassword());
        setEmail(clientDto.getEmail());
        setInvoices(clientDto.getInvoices());


    }

}
