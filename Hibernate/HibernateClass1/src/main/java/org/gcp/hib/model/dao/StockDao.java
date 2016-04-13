package org.gcp.hib.model.dao;

import org.gcp.hib.model.beans.Stock;


public interface StockDao {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	Stock findByStockCode(String stockCode);

}
