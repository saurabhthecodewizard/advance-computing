package com.org;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class UserDaoImpl implements AutoCloseable{
	
	private Session session;
	
	public UserDaoImpl() {
		SessionFactory sessionFactory = HbUtil.getSessionFactory();
		session = sessionFactory.openSession();
	}

	@Override
	public void close() throws Exception {
		if(session != null)
			session.close();
	}
	
	public User findById(int id) {
		return session.get(User.class, id);
	}
	
	public List<User> findAll() {
		String hql = "SELECT u FROM User u";
		Query<User> q = session.createQuery(hql);
		return q.getResultList();
	}
	
	public void update(User user) {
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			session.update(user);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	
	public void deleteById(int id) {
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			User user = session.get(User.class, id);
			
			if(user != null)
				session.delete(user);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	
	public void save(User user) {
Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			
			session.persist(user);
			
			tx.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}

}
