package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Client extends User {

    private List<HistoryProducts> historyProducts;

    public Client() {
        super();
    }
}
