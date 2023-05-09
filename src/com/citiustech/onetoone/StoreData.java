package com.citiustech.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Employee e = new Employee();
	e.setName("raseen");
	Address a = new Address();
	a.setCity("mumbai");
	a.setState("Maharashtra");
	a.setCountry("India");
	e.setAddress(a);
	a.setEmp(e);
	
	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	Session s = sf.openSession();
	Transaction t = s.beginTransaction();
	s.persist(e);
	t.commit();
	Employee e1 = (Employee)s.get(Employee.class,9);
	 System.out.println(e1.getId());
	 System.out.println(e1.getName());
	 System.out.println(e1.getAddress().getCity());
	 System.out.println(e1.getAddress().getState());
	 
	s.close();
	//System.out.println(e.getAddress().getCity());
	 
	System.out.println("Suceesfully mapped");
	}

}
