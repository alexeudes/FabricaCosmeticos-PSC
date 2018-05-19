package negocio;

import java.util.List;

import basicas.PedidoProduto;
import dao.DAOFactory;
import dao.PedidoProdutoDAO;

public class PedidoProdutoRN implements IPedidoProdutoRN {
	
	private PedidoProdutoDAO pedidoProdutoDAO = DAOFactory.getPedidoProdutoDAO();

	@Override
	public List<PedidoProduto> getAll() {
		return pedidoProdutoDAO.getAll();
	}

	@Override
	public PedidoProduto searchByKey(Integer chave) {
		return pedidoProdutoDAO.searchByKey(chave);
	}

	@Override
	public void insert(PedidoProduto pedidoProduto) {
		pedidoProdutoDAO.insert(pedidoProduto);
	}

	@Override
	public PedidoProduto update(PedidoProduto pedidoProduto) {
		return pedidoProdutoDAO.update(pedidoProduto);
	}

	@Override
	public void remove(PedidoProduto pedidoProduto) {
		pedidoProdutoDAO.remove(pedidoProduto);
	}
}
