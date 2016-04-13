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
@Table( name = "CLIENTS")
public class Clients {
	
	@Id
	@Column( name= "ID")
	private int id;
	@Column( name= "NAME")
	private String name;
	@Column( name= "DESCRIPTION")
	private String description;
	
   @OneToMany(mappedBy="clientId",
			   fetch = FetchType.LAZY)
	private Collection<Event> eventList = new ArrayList<Event>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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