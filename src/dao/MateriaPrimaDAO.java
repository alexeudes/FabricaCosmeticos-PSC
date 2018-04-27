package dao;

import javax.persistence.EntityManagerFactory;

import basicas.MateriaPrima;

public class MateriaPrimaDAO extends DAOGenerico<MateriaPrima>{

	public MateriaPrimaDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
