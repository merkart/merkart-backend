package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.Controller.Dto.ProductDto;
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
    private int quantity;
    private int cost;
    private String placeOfCreation;
    private Date createdAt;
    private Category category;
    private boolean isSelected;


    public Product(ProductDto productDto) {
        this.name= productDto.getName();
        this.artisanId=productDto.getArtisan();
        this.description=productDto.getDescription();
        this.quantity=productDto.getQuantity();
        this.cost=productDto.getCost();
        this.placeOfCreation=productDto.getPlaceOfCreation();
        this.createdAt=productDto.getCreatedAt();
        this.category=productDto.getCategory();
        this.isSelected=productDto.isSelected();

    }
    public void  update(Product product){
        this.name=product.getName();
        this.artisanId=product.getArtisanId();
        this.description=product.getDescription();
        this.quantity=product.getQuantity();
        this.cost=product.getCost();
        this.placeOfCreation=product.getPlaceOfCreation();
        this.createdAt=product.getCreatedAt();
        this.category=product.getCategory();
        this.isSelected=product.isSelected();

    }
}
