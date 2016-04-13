package org.gcp.hib.Hibernate5;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOImpl {
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getFactory(){
		return sessionFactory;
	}

	
	public void save(Object u) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(u);
		tx.commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	public List<User> list() {
		Session session = this.sessionFactory.openSession();
		List<User> personList = session.createQuery("from USERDETAILS").list();
		session.close();
		return personList;
	}
	
	/*@SuppressWarnings("unchecked")
	public Model get(int id) {
		Session session = this.sessionFactory.openSession();
		session.beginTransaction();
		User u = (User) session.get(User.class,id);		
		session.close();
		return u;
	}*/


}
