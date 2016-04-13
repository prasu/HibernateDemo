package org.gcp.hib.Hibernate3;

import java.io.Serializable;

import javax.persistence.Embeddable;


@Embeddable
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String first_name;
	private String last_name;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

}
