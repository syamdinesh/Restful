package main.com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DelteTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Session sess=HIbernateUtil.getSessionFact().openSession();
			Transaction tx=sess.beginTransaction();
			
			Employee e=new Employee();
			e.setEid(2);
			sess.delete(e);
			tx.commit();
			
			sess.close();
	}

}
