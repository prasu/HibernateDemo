package org.gcp.hib.MapperExample;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "EVENT_TYPE")
public class EventType {
	@Id
	@Column( name= "ID")
	private int id;
	@Column( name= "TYPE")
	private String type;
	@Column( name= "DESCRIPTION")
	private String description;
	
	@OneToMany(mappedBy="eventType",
			   fetch = FetchType.LAZY)
	private Collection<Event> eventList = new ArrayList<Event>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Collection<Event> getEventList() {
		return eventList;
	}
	public void setEventList(Collection<Event> eventList) {
		this.eventList = eventList;
	}

}