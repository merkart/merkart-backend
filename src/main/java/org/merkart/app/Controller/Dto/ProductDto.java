package org.merkart.app.Controller.Dto;

import lombok.Getter;
import lombok.Setter;

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
}