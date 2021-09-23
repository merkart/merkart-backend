package org.merkart.app.repository.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Document
public class Product {

    @Id
    private String id;
    private String name;
    private String artisanId;
    private String description;
    private int quantity;
    private int cost;
    private String placeOfCreation;
    private Date createdAt;
    private Category category;
    private boolean isSelected;

}
