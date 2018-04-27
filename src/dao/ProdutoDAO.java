package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Produto;

public class ProdutoDAO extends DAOGenerico<Produto>{

	public ProdutoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
