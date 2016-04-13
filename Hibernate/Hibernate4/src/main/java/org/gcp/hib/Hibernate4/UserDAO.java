package org.gcp.hib.Hibernate4;

import java.util.List;

public interface UserDAO {
	
	  public void save(User u);
	     
	    public List<User> list();
	    
	    public User get(int i);
	     

}
