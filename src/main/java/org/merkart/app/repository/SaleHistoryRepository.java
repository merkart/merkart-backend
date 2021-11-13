package org.merkart.app.repository;

import java.util.Date;
import java.util.List;

import org.merkart.app.repository.documents.SaleRecord;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SaleHistoryRepository extends MongoRepository<SaleRecord, String> {

	List<SaleRecord> findByDateBetween(Date start, Date end);
	
}
