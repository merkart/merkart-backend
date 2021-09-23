package org.merkart.app.repository.document;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Getter
@Setter
public class HistoryProducts {

    @Id
    private String id;
    private String clientId;
    private Invoice invoice;

}
