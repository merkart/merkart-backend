package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.List;

@Getter
@Setter
public class HistoryProducts {

    @Id
    private String id;
    private String clientId;
    private Invoice invoice;

}
