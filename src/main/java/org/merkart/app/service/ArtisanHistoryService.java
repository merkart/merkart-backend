package org.merkart.app.service;

import java.util.Date;
import java.util.List;

import org.merkart.app.repository.documents.ArtisanRecord;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("artisan-hist")
public class ArtisanHistoryService implements HistoryService<ArtisanRecord> {

	@Override
	public ArtisanRecord getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArtisanRecord> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArtisanRecord> getByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ArtisanRecord> getByDateRange(Date begin, Date end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveRecord(ArtisanRecord record) {
		// TODO Auto-generated method stub
		
	}

}
