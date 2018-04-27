package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Pessoa;

public class PessoaDAO extends DAOGenerico<Pessoa>{

	public PessoaDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
