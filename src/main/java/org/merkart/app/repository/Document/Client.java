package org.merkart.app.repository.Document;

import lombok.Getter;
import lombok.Setter;
import org.merkart.app.Controller.Dto.UserDto;

import java.util.List;

@Getter
@Setter
public class Client extends User {

    private List<HistoryProducts> historyProducts;

    public Client(UserDto userDto) {
        super(userDto);
    }
}
