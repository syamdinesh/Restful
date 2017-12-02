package com.java.dao;


import java.util.LinkedList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.java.model_entity.Employee;
import com.java.util.HibernateUtil;

public class Dao {
     public void insertExcelData(LinkedList<Employee> excelDataToDataBase){
    	 	Session session=HibernateUtil.getSessionFactory().openSession();
    	 	Transaction txn = session.beginTransaction();
    	    
    	 	for(int i=0;i<100000;i++){
    	 		session.save(excelDataToDataBase);
    	 			if(i%50==0){
    	 				session.flush();
    	 				session.clear();
    	 			}
    	 	}
    	 	txn.commit();
    	 	session.close();
    	 	/*for(Employee emp: excelDataToDataBase)
    	 			session.save(emp);		
 			txn.commit();
 			session.close();*/	
     }
     
     public List<Employee> gettingDetails(){
    	 
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 
    	 //Transaction txn=session.beginTransaction();                             No need of it when you selecting the data
    	 
    	 Query query=session.createQuery("from Employee");
		 List<Employee> list=query.list();
		 
		 
		 Employee e=(Employee) session.load(Employee.class, new Integer(1));
    	 System.out.println(e.geteName());
    	 
    	 e=(Employee) session.load(Employee.class, new Integer(1));
    	 System.out.println(e.getEmail());
    	 
		 //txn.commit();
    	 session.close();
    	 
    	 return list;
     }
     
     /*public void update(String name,String email,String mobileNumber,int sal,int id){
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 Transaction txn=session.beginTransaction();
    	 Query query=session.createQuery("update CrudEntity set user_name= :name,user_email= :email,user_phone_number= :mobileNumber,user_sal= :sal where user_id= :id");
    	 query.setParameter("name", name);
    	 query.setParameter("email", email);
    	 query.setParameter("mobileNumber", mobileNumber);
    	 query.setParameter("sal", sal);
    	 query.setParameter("id", id);
    	 Integer result=(Integer)query.executeUpdate();
    	 System.out.println("CrudDao.update() result::"+result);
    	 
  //====================================================================================================================================================================================================  	 
    	 session.merge(crud);  //if you use update() and merge() methods we can not update primary key and Single coulmn values.So HQL updating(Above approach) is best for this update.
 //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   	 
    	 txn.commit();
 		 session.close();
     }
     
     public Integer delete(int id){
    	 Session session=HibernateUtil.getSessionFactory().openSession();
    	 Transaction txn=session.beginTransaction();
    	 Query query=session.createQuery("delete from CrudEntity where user_id= :id");
    	 query.setParameter("id", id);
    	 Integer result=(Integer)query.executeUpdate();
    	 System.out.println("CrudDao.delete() result::"+result);
    	 txn.commit();
 		 session.close();
 		 return result;
     }
     public static void main(String args[]){
    	 CrudDao cd=new CrudDao();
    	 List<CrudEntity> list=cd.gettingDetails();
    	 System.out.println(list);
     }*/
}