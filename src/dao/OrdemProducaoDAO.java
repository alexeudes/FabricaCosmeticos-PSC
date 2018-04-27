package dao;

import javax.persistence.EntityManagerFactory;

import basicas.OrdemProducao;

public class OrdemProducaoDAO extends DAOGenerico<OrdemProducao>{

	public OrdemProducaoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
