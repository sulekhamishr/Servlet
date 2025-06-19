package com.java.hib;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AgentShowMain {
	
	public static void main(String[] args) {
		
		
		SessionFactory sf= new AnnotationConfiguration().configure().buildSessionFactory();
		System.out.println("Connected");
		
		Session session =sf.openSession();
		
		
		Query query= session.createQuery("from Agent");

		
		List<Agent> AgentList = query.list();
		for (Agent agent : AgentList) {
			System.out.println(agent);
		}
	
	}

}
