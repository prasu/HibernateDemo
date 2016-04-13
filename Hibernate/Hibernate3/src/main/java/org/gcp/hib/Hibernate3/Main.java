package org.gcp.hib.Hibernate3;

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
        a1.setCity("richardson");
        
        Address a2 =new Address();
        a2.setPincode("752021");
        a2.setStreetName("211");
        a2.setCity("dallas");
        
        Person p = new Person();
        p.setFirst_name("prasu");
        p.setLast_name("goli");
        
        Person p1= new Person();
        p1.setFirst_name("mannu");
        p1.setLast_name("puram");
         
        User u1 = new User();
        //u1.setId(1);
        u1.setName(p);
        u1.setHomeAddress(a1);
        u1.setOfficeAddress(a2);
       
        
        User u2= new User();
        //u2.setId(2);
        u2.setName(p1);
        u2.setHomeAddress(a1);
        u2.setOfficeAddress(a2);
       
       
        
        userDAO.save(u1);
        userDAO.save(u2);
     
        
        //close resources
        context.close(); 
    }
}
