package org.merkart.app.repository.documents;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;

@Getter
@Setter
@Document
public class Category {
    @Id
    private String id;
    private String name;
    private String description;
    private Date createdAt;


}
