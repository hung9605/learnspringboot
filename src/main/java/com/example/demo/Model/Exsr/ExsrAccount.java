package com.example.demo.Model.Exsr;

import java.util.ArrayList;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Model.Entity.Account;

public class ExsrAccount implements InAccount {

	private EntityManagerFactory entityManagerFactory;
	
	
	

	public ExsrAccount(EntityManagerFactory entityManagerFactory) {
		super();
		this.entityManagerFactory = entityManagerFactory;
	}


	@Override
	public Account getAcc(String username, String password) {
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		String hql = "from Account a where a.userName=:user and a.passWord=:pass";
		Query q = s.createQuery(hql);
		q.setParameter("user", username);
		q.setParameter("pass", password);
		return (Account) q.getSingleResult();
	}

	@Override
	public Account getAcc(int id) {
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		String hql = "from Account a where a.iD=:id";
		Query q = s.createQuery(hql);
		q.setParameter("id", id);
		return (Account) q.getSingleResult();
	}

	@Override
	public ArrayList<Account> getAll() {
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		String hql = "from Account";
		Query q = s.createQuery(hql);
		return (ArrayList<Account>) q.list();
	}

	@Override
	public int InsertAcc(Account a) {
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tr = s.beginTransaction();
		int result = 0;
		try {
			result = (int) s.save(a);
			tr.commit();
		} catch (Exception ex) {
			tr.rollback();
			s.close();
		}
		return result;
	}

	@Override
	public int UpdateAcc(Account a) {
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tr = s.beginTransaction();
		int result = 0;
		try {
			 s.update(a);
			tr.commit();
		} catch (Exception ex) {
			tr.rollback();
			s.close();
		}
		return result;
	}

	@Override
	public int DeleteAcc(int id) {
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tr = s.beginTransaction();
		int result = 0;
		try {
			 s.delete(id);
			
			tr.commit();
		} catch (Exception ex) {
			tr.rollback();
			s.close();
		}
		return result;
	}

	@Override
	public Account getAccEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getAcc(String email) {
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		String hql = "select idTk from InformationAccount a where a.email=:email";
		Query q = s.createQuery(hql);
		q.setParameter("email", email);
		return (int) q.uniqueResult();
	}


	@Override
	public int updatePass(String pass,String id) {
		Session s = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		String hql = "update Account set password=:pass where id=:id";
		Query q = s.createQuery(hql);
		q.setParameter("pass", pass);
		q.setParameter("id", id);
		return (int) q.executeUpdate();
	}
	


}
