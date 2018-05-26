package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Quimico;

public class QuimicoDAO extends DAOGenerico<Quimico>{

	public QuimicoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
