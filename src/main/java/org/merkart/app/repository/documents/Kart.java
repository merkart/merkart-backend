package org.merkart.app.repository.documents;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Kart {
	
	@Id
	private String clientId;
	private List<Product> products;

}
