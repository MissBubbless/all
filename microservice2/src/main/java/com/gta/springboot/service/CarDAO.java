package com.gta.springboot.service;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.gta.springboot.model.Car;

public class CarDAO {
	Configuration configuration = new Configuration().configure();

	public ArrayList<Car> carList() {
		ArrayList<Car> list = new ArrayList<Car>();
		SessionFactory sessionFactory = new Configuration().configure().addAnnotatedClass(Car.class)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			list = (ArrayList<Car>) session.createQuery("FROM Car").list();
			transaction.commit();
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

}