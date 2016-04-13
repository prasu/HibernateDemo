package org.gcp.hib.Hibernate3;

import java.util.List;

public interface UserDAO {
	
	  public void save(User u);
	     
	    public List<User> list();
	    
	    public User get(int i);
	     

}
