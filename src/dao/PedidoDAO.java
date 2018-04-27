package dao;

import javax.persistence.EntityManagerFactory;

import basicas.Pedido;

public class PedidoDAO extends DAOGenerico<Pedido>{

	public PedidoDAO(EntityManagerFactory emf) {
		super(emf);
	}

}
