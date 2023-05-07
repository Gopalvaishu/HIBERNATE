package programs;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class connection {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		System.out.println("Table created");
	}

}
 