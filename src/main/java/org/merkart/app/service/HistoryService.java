package org.merkart.app.service;

import java.util.Date;
import java.util.List;

public interface HistoryService<T> {
	
	public T getById(String id);
	public List<T> getAll();
	public List<T> getByDate(Date date);
	public List<T> getByDateRange(Date begin, Date end);
	public void saveRecord(T record);

}
