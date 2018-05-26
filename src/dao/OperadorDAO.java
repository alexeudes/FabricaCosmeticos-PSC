package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Operador;

public class OperadorDAO extends DAOGenerico<Operador>{

	public OperadorDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
