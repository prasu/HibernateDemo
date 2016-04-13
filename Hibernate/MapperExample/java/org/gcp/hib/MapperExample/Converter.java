package org.gcp.hib.MapperExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.modelmapper.AbstractConverter;

public class Converter extends AbstractConverter<List<EventRelData>, HashMap<String,String>> {

	@Override
	protected HashMap<String,String> convert(List<EventRelData> relDat) {
		HashMap<String,String> mapData = new HashMap<String,String>();
		
		Iterator itr = relDat.iterator();
		while(itr.hasNext()) {
			
			EventRelData element = (EventRelData) itr.next();
	        if(element.getEventData().contains("SPRING") && 
	        		element.getEventKey().contains("TOTAL")){	        	
	        	mapData.put("EBIZ_SPRING", element.getEventData());
	        }else if(element.getEventData().contains("OSGI") && 
	        		element.getEventKey().contains("TOTAL")){
	        	mapData.put("EBIZ_OSGI", element.getEventData());
	        }
			
		}
		
		return mapData;
	}	

}
