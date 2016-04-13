package org.gcp.hib.MapperExample;

import java.util.HashMap;

public class EventData {	
	private String client;
	private HashMap<String,String> layerTotalTime=new HashMap<String, String>();	
	
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	
	public void put(String key,String value){
		layerTotalTime.put(key, value);
	}
	
	public String get(String key){
		return layerTotalTime.get(key);
	}
	
	public void setLayerTotalTime(HashMap<String, String> layerTotalTime) {
		this.layerTotalTime = layerTotalTime;
	}
	

}
