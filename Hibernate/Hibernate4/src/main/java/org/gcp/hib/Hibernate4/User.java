package org.gcp.hib.Hibernate4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "USER_DETAILS")
public class User {
	
	@Id
	@GeneratedValue
	private int id;
   
	@ElementCollection(fetch=FetchType.EAGER)
    @JoinTable(name ="USER_ADDRESS",
               joinColumns =@JoinColumn(name="USER_ID"))
	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
	@CollectionId(columns = { @Column(name ="ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type ="long"))
    private Collection<Address> listofAddress = new ArrayList<Address>();
        
	 public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	
	public Collection<Address> getListofAddress() {
		return listofAddress;
	}
	public void setListofAddress(Collection<Address> listofAddress) {
		this.listofAddress = listofAddress;
	}
}