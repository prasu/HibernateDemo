package org.gcp.hib.Hibernate2;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String streetName;
	private String pincode;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

}
