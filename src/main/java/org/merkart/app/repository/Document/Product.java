package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document
@Getter
@Setter
public class Product {

    @Id
    private String id;
    private String name;
    private String artisanId;
    private String description;
    private int cost;
    private String placeOfCreation;
    private Date createdAt;
    private Category category;
    private boolean isSelected;

}
