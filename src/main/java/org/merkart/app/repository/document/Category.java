package org.merkart.app.repository.document;

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
    public String id;
    public String name;
    public String description;
    public Date createdAt;


}
