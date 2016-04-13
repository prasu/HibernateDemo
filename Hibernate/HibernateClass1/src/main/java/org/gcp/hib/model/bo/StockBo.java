package org.gcp.hib.model.bo;

import org.gcp.hib.model.beans.Stock;


public interface StockBo {
	
	void save(Stock stock);
	
	void update(Stock stock);
	
	void delete(Stock stock);
	
	Stock findByStockCode(String stockCode);

}