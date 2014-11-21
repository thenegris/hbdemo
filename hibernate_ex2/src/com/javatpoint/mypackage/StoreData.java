package com.javatpoint.mypackage;

import org.hibernate.*;  
import org.hibernate.cfg.*;
	  
	public class StoreData {  
		
	public static void main(String[] args) {  
	      
	    //creating configuration object  
		Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();     
		Transaction t=session.beginTransaction(); 
	    Employee e1=new Employee();  
	    e1.setId(1002);  
	    e1.setFirstName("diana");  
	    e1.setLastName("grajaiswal");  
	      
	    session.persist(e1);//persisting the object  
	      
	    t.commit();//transaction is commited  
	    session.close();  
	      
	    System.out.println("successfully saved");    
	      
	}  
	

}
