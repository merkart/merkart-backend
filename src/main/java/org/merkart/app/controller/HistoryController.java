package org.merkart.app.controller;

import java.util.Date;

import org.merkart.app.controller.dto.SaleHistoryDto;
import org.merkart.app.repository.documents.ArtisanRecord;
import org.merkart.app.repository.documents.SaleRecord;
import org.merkart.app.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/history")
public class HistoryController {

	private HistoryService<SaleRecord> salesHistoryServ;
	private HistoryService<ArtisanRecord> artisanHistoryServ;
	
	@Autowired
	public HistoryController(@Qualifier("sales-hist") HistoryService salesHistoryServ, @Qualifier("artisan-hist") HistoryService artisanHistoryServ) {
		this.salesHistoryServ = salesHistoryServ;
		this.artisanHistoryServ = artisanHistoryServ;
	}

	
	//Sales History endpoints
		
	@GetMapping("/sales/{clientId}")
	public ResponseEntity<?> getById(@PathVariable String clientId) {
		try {
			return ResponseEntity.ok()
					.body( salesHistoryServ.getById(clientId) );
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@GetMapping("/sales/all")
	public ResponseEntity<?> getAll() {
		try {
			return ResponseEntity.ok()
					.body( salesHistoryServ.getAll() );
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@GetMapping("/sales/date-engine/{date}&{end}")
	public ResponseEntity<?> getByDate(@PathVariable Date startDate, @PathVariable Date endDate) {
		try {
			return ResponseEntity.ok()
					.body( salesHistoryServ.getByDateRange(startDate, endDate) );
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	
	@PutMapping("/sales/{clientId}")
	public ResponseEntity<?> saveSale(@PathVariable String clientId, @RequestBody SaleHistoryDto saleDto) {
		try {
			salesHistoryServ.saveRecord(saleDto);
			return ResponseEntity.accepted().build();
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	@DeleteMapping("/sales/{clientId}")
	public ResponseEntity<?> deleteHistory(@PathVariable String clientId){
		try {
			return ResponseEntity.ok().build();
		} catch (Exception ex) {
			return ResponseEntity.internalServerError().build();
		}
	}
	
	
	//Artisan History ednpoints
	
	
	
	
	
}
