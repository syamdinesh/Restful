package main.com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Session sess=HIbernateUtil.getSessionFact().openSession();
			Transaction tx=sess.beginTransaction();
			
			Employee e1=(Employee)sess.get(Employee.class, 1);
			
			
			Employee e=new Employee();
			e.setEid(1);
			e.setEname("Dinesh");
			e.setMobilenumber(7411153176l);
			e.setSal(50000);
			
			sess.merge(e);
			//sess.update(e);
			tx.commit();
	}

}
