package com.capg.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainRunner {
	
	private static EntityManagerFactory entityManagerFactory =
	          Persistence.createEntityManagerFactory("pu");
	
	public static void main(String[] args) {
		
		 try {
	    	  doSave();
	      } finally {
	          entityManagerFactory.close();
	      }
		
	}
	
	 private static void doSave() {
	      System.out.println("1 "+entityManagerFactory);
	      EntityManager em = entityManagerFactory.createEntityManager();
		
	      System.out.println("2 "+em);
	      
	      //Training t = new Training(1007,"Hibernate",40);
	     // opp.setTrainingId(1004);
	      //System.out.println(" 3 "+ t);
	      em.getTransaction().begin();
	      System.out.println(" 4 Transaction started ");
	      //em.persist(t);
	      System.out.println(" 5 Persist called ");
	      em.getTransaction().commit();
	      System.out.println(" 6 commit ");
	      Training t1 = em.find(Training.class, 1007);
	      System.out.println("Database values:- "+t1);

	      em.close();
	      System.out.println("closed ");
	      	  }

}
