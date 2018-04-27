package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Atendente;

public class AtendenteDAO extends DAOGenerico<Atendente> {
	
	public AtendenteDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
