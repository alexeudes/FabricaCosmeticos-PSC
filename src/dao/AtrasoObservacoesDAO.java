package dao;

import javax.persistence.EntityManagerFactory;

import basicas.AtrasoObservacoes;

public class AtrasoObservacoesDAO extends DAOGenerico<AtrasoObservacoes>{

	public AtrasoObservacoesDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
