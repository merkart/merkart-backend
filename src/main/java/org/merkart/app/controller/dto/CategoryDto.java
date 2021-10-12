package org.merkart.app.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CategoryDto {

    private String name;
    private String description;
    private Date createdAt;

}
