package org.merkart.app.service;

import java.util.Date;
import java.util.List;

import org.merkart.app.repository.SaleHistoryRepository;
import org.merkart.app.repository.documents.SaleRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("sales-hist")
public class SaleHistoryService implements HistoryService<SaleRecord> {
	
	@Autowired
	private SaleHistoryRepository saleRepo;

	@Override
	public SaleRecord getById(String id) {
		return saleRepo.findById(id)
				.orElseThrow();
	}

	@Override
	public List<SaleRecord> getAll() {
		return saleRepo.findAll();
	}

	@Override
	public List<SaleRecord> getByDate(Date date) {
		return this.getByDateRange(date, date);
	}

	@Override
	public List<SaleRecord> getByDateRange(Date begin, Date end) {
		return saleRepo.findByDateBetween(begin, end);
	}

	@Override
	public void saveRecord(SaleRecord record) {
		saleRepo.save(record);
	}

}
