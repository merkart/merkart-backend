package org.merkart.app.Controller.Dto;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.repository.Document.Category;

import java.util.Date;
@Setter
@Getter
public class ProductDto {
    private String name;
    private String artisan;
    private String description;
    private int cost;
    private String placeOfCreation;
    private Date createdAt;
    private boolean isSelected;
    private int quantity;
    private Category Category;

}