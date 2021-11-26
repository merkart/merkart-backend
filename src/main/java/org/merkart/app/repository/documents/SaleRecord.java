package org.merkart.app.repository.documents;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SaleRecord {
	
	private Date date;
	private String clientId;
	private List<Product> productsBought;

}
