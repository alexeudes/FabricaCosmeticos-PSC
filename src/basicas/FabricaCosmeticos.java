package basicas;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaCosmeticos {

	public static void main(String[] args)
	{
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernatefc");
		factory.close();

	}

}