package org.merkart.app.util;

import org.merkart.app.controller.dto.SaleHistoryDto;
import org.merkart.app.repository.documents.SaleRecord;

public class SaleHistoryMapper {
	
	public static SaleRecord toSaleRecord(SaleHistoryDto saleDto) {
		var saleR = new SaleRecord();
		return saleR;
	}

}
