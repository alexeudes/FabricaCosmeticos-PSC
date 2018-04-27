package dao;

import javax.persistence.EntityManagerFactory;

public class ClienteDAO extends DAOGenerico{

	public ClienteDAO(EntityManagerFactory emf) {
		super(emf);
	}
}