package org.merkart.app.repository.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
public class Product {

    @Id
    private String id;
    private String name;
    private String artisan;
    private String description;
    private int cost;
    private String placeOfCreation;
    private Date createdAt;
    private Category category;
    private boolean isSelected;

}
