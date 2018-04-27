package dao;

import javax.persistence.EntityManagerFactory;

import basicas.GerenteVenda;

public class GerenteVendaDAO extends DAOGenerico<GerenteVenda>{

	public GerenteVendaDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
