package dao;

import javax.persistence.EntityManagerFactory;

import basicas.GerenteDesenvolvimento;

public class GerenteDesenvolvimentoDAO extends DAOGenerico<GerenteDesenvolvimento>{

	public GerenteDesenvolvimentoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
