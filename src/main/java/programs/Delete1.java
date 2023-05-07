package programs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete1 {

	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		CreateTable createTable=entityManager.find(CreateTable.class,2);
		//createTable.setId(1);
		//createTable.setName("Sidd");
		//createTable.setPhone(987545078);
		
		entityTransaction.begin();
		entityManager.remove(createTable);
		entityTransaction.commit();
		
		System.out.println("The Data is deleted");
		
		
		
	}
	
	
}
