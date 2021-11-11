package org.merkart.app.service;

import java.util.Date;
import java.util.List;

import org.merkart.app.repository.documents.SaleRecord;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("sales-hist")
public class SaleHistoryService implements HistoryService<SaleRecord> {

	@Override
	public SaleRecord getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SaleRecord> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SaleRecord> getByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SaleRecord> getByDateRange(Date begin, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRecord(SaleRecord record) {
		// TODO Auto-generated method stub
		
	}

}
