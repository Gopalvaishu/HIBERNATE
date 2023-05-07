package programs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		CreateTable createTable=new CreateTable();
		createTable.setId(1);
		createTable.setName("Madhu");
		createTable.setPhone(987654578);
		
		entityTransaction.begin();
		entityManager.merge(createTable);
		entityTransaction.commit();
		
		System.out.println("The Data is Updated");
		
		
		
	}
}
