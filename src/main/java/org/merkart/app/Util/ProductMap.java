package org.merkart.app.Util;


import lombok.Setter;
import org.merkart.app.Controller.Dto.ProductDto;
import org.merkart.app.repository.Document.Category;
import org.merkart.app.repository.Document.Product;

import java.util.Date;
@Setter
public class ProductMap {
    public static ProductDto doProductDTO(Product product){
        ProductDto newProductDto= new ProductDto();
        newProductDto.setName(product.getName());
        newProductDto.setArtisan(product.getArtisanId());
        newProductDto.setDescription(product.getDescription());
        newProductDto.setCost(product.getCost());
        newProductDto.setPlaceOfCreation(product.getPlaceOfCreation());
        newProductDto.setCreatedAt(product.getCreatedAt());
        newProductDto.setSelected(product.isSelected());
        return newProductDto;
    }
    public static Product doProduct(ProductDto productDto){
        Product newProduct= new Product();
        newProduct.setId(newProduct.getId());
        newProduct.setName(productDto.getName());
        newProduct.setArtisanId(productDto.getArtisan());
        newProduct.setDescription(productDto.getDescription());
        newProduct.setCost(productDto.getCost());
        newProduct.setPlaceOfCreation(productDto.getPlaceOfCreation());
        newProduct.setCreatedAt(productDto.getCreatedAt());
        newProduct.setCategory(newProduct.getCategory());
        newProduct.setSelected(productDto.isSelected());
        return newProduct;


    }
}
