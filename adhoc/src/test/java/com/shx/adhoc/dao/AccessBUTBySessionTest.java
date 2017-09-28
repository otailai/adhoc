package com.shx.adhoc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shx.adhoc.model.But;

public class AccessBUTBySessionTest {
	
	public static ApplicationContext applicationContext;
	public static SessionFactory sessionFactory;
	public static final String path = "classpath:/resource/spring-dao.conf.xml";
	public static Session session;
	public static Transaction transaction;
	
	@Before
	public void openSession() {
		applicationContext = new ClassPathXmlApplicationContext(path);
		sessionFactory = (SessionFactory) applicationContext.getBean("sessionFactory");
		session = sessionFactory.openSession();
		System.out.println("Open Session: " + session);
	}
	
	@After
	public void closeSession() {
		session.close();
	}
	
	@Test
	public void main() {
		transaction = session.beginTransaction();
		Query query = (Query) session.createQuery("from But");
		transaction.commit();
		@SuppressWarnings("unchecked")
		List<But> buts = (List<But>)query.list();
		for (But but : buts) {
			System.out.println(but.getPartner() + but.getName());
		}
	}
}
