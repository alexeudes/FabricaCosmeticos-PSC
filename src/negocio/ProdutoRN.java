package negocio;

import java.util.List;

import basicas.Produto;
import dao.DAOFactory;
import dao.ProdutoDAO;

public class ProdutoRN implements IProdutoRN {
	
	private ProdutoDAO produtoDAO = DAOFactory.getProdutoDAO();

	@Override
	public List<Produto> getAll() {
		return produtoDAO.getAll();
	}

	@Override
	public Produto searchByKey(Integer chave) {
		return produtoDAO.searchByKey(chave);
	}

	@Override
	public void insert(Produto produto) {
		produtoDAO.insert(produto);
	}

	@Override
	public Produto update(Produto produto) {
		return produtoDAO.update(produto);
	}

	@Override
	public void remove(Produto produto) {
		produtoDAO.remove(produto);
	}
}
