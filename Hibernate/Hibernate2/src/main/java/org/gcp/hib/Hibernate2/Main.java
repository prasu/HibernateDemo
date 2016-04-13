package org.gcp.hib.Hibernate2;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        
        UserDAO userDAO = context.getBean(UserDAO.class);
        
        Address a1 =new Address();
        a1.setPincode("75081");
        a1.setStreetName("430");
         
        User u1 = new User();
        //u1.setId(1);
        u1.setUserName("prasu");
        u1.setAddress(a1);
        u1.setDescription("description");
        u1.setJoinedDate(new Date());
        u1.setUserfirstname("gcp");
        
        User u2= new User();
        //u2.setId(2);
        u2.setUserName("mannu");
        u2.setAddress(a1);
        u2.setDescription("description");
        u2.setJoinedDate(new Date());
        u2.setUserfirstname("puram");
       
        
        userDAO.save(u1);
        userDAO.save(u2);
     
        User u = userDAO.get(2);
         
        System.out.println(u.getAddress());
        //close resources
        context.close(); 
    }
}
