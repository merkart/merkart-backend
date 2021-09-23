package org.merkart.app.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.repository.document.Category;

import java.util.Date;
@Setter
@Getter
public class ProductDto {
    private String name;
    private String artisanId;
    private String description;
    private int cost;
    private String placeOfCreation;
    private Date createdAt;
    private boolean isSelected;
    private int quantity;
    private Category Category;

}