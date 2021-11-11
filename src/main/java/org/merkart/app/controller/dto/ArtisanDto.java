package org.merkart.app.controller.dto;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.repository.documents.Product;
import org.merkart.app.util.ROLE;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ArtisanDto extends UserDto{
	
	private String typeOfId;
    private String idNumber;
    private String country;
    private String phone;
    
    private ROLE role;
    private String url;

    private List<Product> productList;

    public ArtisanDto() {
        super();
        productList = new ArrayList<Product>();
    }
}
