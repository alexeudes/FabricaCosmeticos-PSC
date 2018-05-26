package dao;

import javax.persistence.EntityManagerFactory;

import basicas.GerenteProducao;

public class GerenteProducaoDAO extends DAOGenerico<GerenteProducao>{

	public GerenteProducaoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
