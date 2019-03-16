package com.capgemini.dev.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadData 
{
public static void main(String[] args) 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("myPersistanceUnit");
	EntityManager manager=emf.createEntityManager();
	manager.getTransaction().begin();
	Employee emp=manager.find(Employee.class,102);
	
	emp.setLoc("pat");
	emp.setEname("sumit");
	System.out.println(emp);
	manager.getTransaction().commit();
	manager.close();
	emf.close();
}
}
