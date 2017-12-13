package main.com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HIbernateUtil {
	static SessionFactory sf=null;
	
	public static SessionFactory getSessionFact(){
		Configuration cfg=new Configuration().configure("main/com/resources/Hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		return sf;
	}
}
