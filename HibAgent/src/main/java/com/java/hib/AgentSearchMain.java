package com.java.hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AgentSearchMain {
	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		 int empno   =in.nextInt();
		 
		 SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();
		 Session session =sf.openSession() ;
	

				 
	}

}
