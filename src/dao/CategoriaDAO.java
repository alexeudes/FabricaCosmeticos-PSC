package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Categoria;

public class CategoriaDAO extends DAOGenerico<Categoria>{

	public CategoriaDAO(EntityManagerFactory emf) {
		super(emf);
	}

}