package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Compra;

public class CompraDAO extends DAOGenerico<Compra>{

	public CompraDAO(EntityManagerFactory emf) {
		super(emf);
	}
}
