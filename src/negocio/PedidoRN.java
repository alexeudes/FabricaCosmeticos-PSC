package negocio;

import java.util.List;

import basicas.Pedido;
import dao.DAOFactory;
import dao.PedidoDAO;

public class PedidoRN implements IPedidoRN {
	
	private PedidoDAO pedidoDAO = DAOFactory.getPedidoDAO();

	@Override
	public List<Pedido> getAll() {
		return pedidoDAO.getAll();
	}

	@Override
	public Pedido searchByKey(Integer chave) {
		return pedidoDAO.searchByKey(chave);
	}

	@Override
	public void insert(Pedido pedido) {
		pedidoDAO.insert(pedido);
	}

	@Override
	public Pedido update(Pedido pedido) {
		return pedidoDAO.update(pedido);
	}

	@Override
	public void remove(Pedido pedido) {
		pedidoDAO.remove(pedido);
	}
}
