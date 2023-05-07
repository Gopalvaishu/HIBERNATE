package programs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insertvalues {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		CreateTable createtable=new CreateTable();
		createtable.setId(2);
		createtable.setName("Vishnu");
		createtable.setPhone(799665780);
		
		entityTransaction.begin();
		entityManager.persist(createtable);
		entityTransaction.commit();
		
		System.out.println("Data inserted");
		
		
	}

}
