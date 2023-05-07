package programs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Fetch1 {
	
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//no need of transaction for fetch-EntityTransaction entityTransaction=entityManager.getTransaction();
		
		CreateTable createTable=entityManager.find(CreateTable.class,1);
		//createTable.setId(1);
		//createTable.setName("Sidd");
		//ceateTable.setPhone(987545078);
		System.out.println("ID:"+createTable.getId()+" "+"name:"+createTable.getName()+" "+"phone:"+createTable.getPhone());
		//entityTransaction.begin();
		//entityManager.merge(createTable);
		//entityTransaction.commit();
		
		
		
	}

}
