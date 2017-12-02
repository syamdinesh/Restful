package com.java.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	/*SessionFactory sf=null;*/
	
	public static SessionFactory getSessionFactory(){
		Configuration cfg=new Configuration().configure("hibernate.config.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		return sf;	
	}
}