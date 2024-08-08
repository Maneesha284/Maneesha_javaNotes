package com.all.methods;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {
	public static void main(String args[]) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
		
		Student s=new Student();
//		s.setSno(101);
//		s.setSname("Anu");
//		s.setSadd("vizag");
		
//		s.setSmarks(65);
//		openSession.save(s);
		
//		System.out.println("Enter no,name,address and age");
//		Scanner sr=new Scanner(System.in);
//		s.setSno(sr.nextInt());
//		s.setSname(sr.next());
//		s.setSadd(sr.next());
//		s.setSmarks(sr.nextInt());
//		//openSession.save(s);
//		openSession.persist(s);
//		System.out.println("Inserted successfully");
//		beginTransaction.commit();
//		
		//Student s1=openSession.get(Student.class, 102); 
		//System.out.println(s1);
		
		//Student s2=openSession.load(Student.class, 102);
		//System.out.println(s2);
		
		Student std= new Student();
		openSession.load(std, 103);
		System.out.println(std);		
		
		
		
		
		
	}
}
