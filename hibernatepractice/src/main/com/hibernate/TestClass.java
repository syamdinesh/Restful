package main.com.hibernate;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.hibernate.Session;

public class TestClass {
	
	final static Logger logger=Logger.getLogger(TestClass.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			
			BasicConfigurator.configure();
			
			int i=10;
			int j=0;
			System.out.println(i/j);
			Session sess=HIbernateUtil.getSessionFact().openSession();
			
			Session sess1=HIbernateUtil.getSessionFact().openSession();
			//Transaction tx=sess.beginTransaction();
			
			/*Employee e=new Employee();
			e.setEname("Syam");
			e.setMobilenumber(7411153176l);
			e.setSal(10000);*/
			
			//Object o=sess.get(Employee.class, 1);
			Employee e1=(Employee)sess.get(Employee.class, 1);
			
			
			System.out.println(e1.getEid());
			System.out.println(e1.getEname());
			
			
			Employee e2=(Employee)sess1.get(Employee.class, 1);
			System.out.println(e2.getEid());
			System.out.println(e2.getEname());
			
			/*int i=(Integer)sess.save(e);
			tx.commit();*/
			sess.close();
		}catch(ArithmeticException ex){
			logger.error("Sorry something happened! "+ ex);
		}
	}
}
