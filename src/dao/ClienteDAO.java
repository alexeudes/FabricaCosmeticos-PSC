package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Cliente;

public class ClienteDAO extends DAOGenerico<Cliente>{

	public ClienteDAO(EntityManagerFactory emf) {
		super(emf);
	}
}