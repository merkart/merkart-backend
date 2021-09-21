package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter
@Setter
public class Category {
    @Id
    public String id;
    public String name;
    public String description;
    public Date createdAt;

}
