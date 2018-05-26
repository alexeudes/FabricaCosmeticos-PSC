package dao;

import javax.persistence.EntityManagerFactory;

import basicas.PedidoProduto;

public class PedidoProdutoDAO extends DAOGenerico<PedidoProduto>{

	public PedidoProdutoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
