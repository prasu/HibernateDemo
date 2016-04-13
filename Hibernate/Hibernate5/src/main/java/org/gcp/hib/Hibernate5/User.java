package org.gcp.hib.Hibernate5;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class User {

	@Id
	@GeneratedValue
	private int id;
   
	@OneToOne
	@JoinColumn(name="VEHICLE_ID")
	private Vehicle vehicle;
	
	@OneToMany
	@JoinTable(name="ADDRESS_USER_MEDIATOR",
	           joinColumns = @JoinColumn(name = "USER_ID"),
	           inverseJoinColumns = @JoinColumn(name = "ADDRESS_ID"))	
	private Collection<Address> address = new ArrayList<Address>();
	
	@OneToMany(mappedBy="user")
	private Collection<Role> roles = new ArrayList<Role>();
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Collection<Address> getAddress() {
		return address;
	}

	public void setAddress(Collection<Address> address) {
		this.address = address;
	}

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
}