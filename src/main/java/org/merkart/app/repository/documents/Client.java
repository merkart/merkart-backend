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
        this.name = clientDto.getName();
        this.lastname = clientDto.getLastname();
        this.idNumber = clientDto.getIdNumber();
        this.typeOfId = clientDto.getTypeOfId();
        this.phone = clientDto.getPhone();
        this.country = clientDto.getCountry();
        this.password =clientDto.getPassword();
        this.email = clientDto.getEmail();
        this.invoices = clientDto.getInvoices();


    }

}
