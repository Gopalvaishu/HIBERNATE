package programs;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchEntireValues {
	
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		//no need of transaction for fetch-EntityTransaction entityTransaction=entityManager.getTransaction();
		
		//CreateTable createTable=entityManager.find(CreateTable.class,1);
		Query query=entityManager.createQuery("select ct from student ct",CreateTable.class);
		List<CreateTable> lst=query.getResultList();
		//createTable.setId(1);
		//createTable.setName("Sidd");
		//ceateTable.setPhone(987545078);
		for(CreateTable ct:lst) {
		System.out.println("ID:"+ct.getId()+" "+"name:"+ct.getName()+" "+"phone:"+ct.getPhone());
		//entityTransaction.begin();
		//entityManager.merge(createTable);
		//entityTransaction.commit();
		}
		}
}
