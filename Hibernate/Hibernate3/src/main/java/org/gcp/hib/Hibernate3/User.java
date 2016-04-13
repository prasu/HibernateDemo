package org.gcp.hib.Hibernate3;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "USERDETAILS")
public class User {
	
	@EmbeddedId
	private Person name;
    @Embedded
    @AttributeOverrides(
    		{ @AttributeOverride(name = "streetName", column = @Column(name = "HOME_STREET")),
    		 @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY")),  
    		 @AttributeOverride(name = "pincode", column = @Column(name = "HOME_CODE"))} 
    		)
	private Address homeAddress;
    @Embedded
	private Address officeAddress;
    
    
	public Person getName() {
		return name;
	}
	public void setName(Person name) {
		this.name = name;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	
}