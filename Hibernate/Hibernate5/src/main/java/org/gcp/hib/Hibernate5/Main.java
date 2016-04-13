package org.gcp.hib.Hibernate5;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring5.xml");
		DAOImpl impl = context.getBean(DAOImpl.class);

		
		Vehicle v1 = new Vehicle();
		v1.setVehicleName("Nissan");
		
		Address a = new Address();
		a.setStreet("430");
		
		Address a1 = new Address();
		a1.setStreet("211");
		
		Role r1 = new Role();
		r1.setRole("PM");
		
		Role r2 = new Role();
		r2.setRole("SM");
		
		User u1 = new User();
		// u1.setId(1);
		u1.setVehicle(v1);
		u1.getAddress().add(a);
		u1.getAddress().add(a1);
		u1.getRoles().add(r1);
		u1.getRoles().add(r2);
		
		a.setUser(u1);
		a1.setUser(u1);
		
		r1.setUser(u1);
		r2.setUser(u1);
        
		Session session = impl.getFactory().openSession();
		Transaction tx = session.beginTransaction();		
		session.save(u1);
		session.save(v1);
		session.save(a);
		session.save(a1);
		tx.commit();
		session.close();
		

		// close resources
		context.close();
	}
}
