package com.citiustech.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.citiustech.onetomany.Employee;

import antlr.collections.List;

public class StoreDataInOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Department d = new Department();
//		d.setDeptid(101);
//		d.setName("It");
//		Employee e = new Employee();
//		e.setId(101);
//		e.setName("Yaseen");
//		e.setDept(d);
//		Employee e1 = new Employee();
//		e1.setId(102);
//		e1.setName("Vishal");
//		e1.setDept(d);
//		Set<Employee> empset = new HashSet<>();
//		empset.add(e);
//		empset.add(e1);
//		d.setEmpset(empset);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
//		s.persist(e);
//		s.persist(e1);
//		s.persist(d);
		t.commit();
//		Department d = s.get(Department.class, 101);
//		for(Employee d1 :d.getEmpset()){
//			System.out.println(d1.getName()+"----"+d1.getId()+"-----"+d1.getDept());
//			
//			
//		}
		Department d = (Department)s.get(Department.class, 101);
		for(Employee e : d.getEmpset()){
			System.out.println(e.getId()+"----"+e.getName()+"-----"+d.getName());
		}
		
		System.out.println();
		s.close();
		System.out.println("Sucessfully mapped one to many");
	
	}

}
