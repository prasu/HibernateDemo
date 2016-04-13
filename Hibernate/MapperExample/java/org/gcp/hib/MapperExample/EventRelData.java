package org.gcp.hib.MapperExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table( name = "EVENT_REL_DATA")
public class EventRelData {
	@Id
	@Column( name= "ID")
	private int id;
	
	@Column( name= "EVENT_KEY")
	private String eventKey;
	@Column( name= "EVENT_DATA")
	private String eventData;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn( name = "EVENT_ID")
	private Event eventId;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEventKey() {
		return eventKey;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	public String getEventData() {
		return eventData;
	}
	public void setEventData(String eventData) {
		this.eventData = eventData;
	}
	public Event getEventId() {
		return eventId;
	}
	public void setEventId(Event eventId) {
		this.eventId = eventId;
	}
	
	public String toString() { 
	    return "EventKey: '" + eventKey + "', eventData: '" + eventData + "'";
	} 
	
	
}
