package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Fornecedor;

public class FornecedorDAO extends DAOGenerico<Fornecedor>{

	public FornecedorDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
