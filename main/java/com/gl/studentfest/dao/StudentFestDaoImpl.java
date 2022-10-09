package com.gl.studentfest.dao;

import java.util.List;

import javax.transaction.Synchronization;
import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.resource.transaction.spi.TransactionStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.gl.studentfest.entity.studentEntity;

@Repository
public class StudentFestDaoImpl implements StudentFestDao {

	public StudentFestDaoImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	private SessionFactory sessionFactory;
	private Session session;
	
	
	@Autowired
	public StudentFestDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	try {
		session = sessionFactory.getCurrentSession();
	} catch (Exception e) {
		
		session = sessionFactory.openSession();
		// TODO: handle exception
	}
		
	}

	@Transactional
	public List<studentEntity> RegisterdStudentsList() {
		// TODO Auto-generated method stub
		 Transaction tx = session.beginTransaction();
		
		 List<studentEntity>  registerdStudentsList = 
				 session.createQuery("from studentEntity").list();
		 
		 tx.commit();
			 
		return registerdStudentsList;
	}
	
	@Transactional
	public void RegisterStudent(studentEntity studentEntityO)
	{
		System.out.println("jjj");
		Transaction tx = session.beginTransaction();
		
		session.saveOrUpdate(studentEntityO);
		
		tx.commit();
		
	}

}
