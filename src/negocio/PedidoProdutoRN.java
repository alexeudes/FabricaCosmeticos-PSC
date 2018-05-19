package negocio;

import java.util.List;

import basicas.MateriaPrima;
import dao.DAOFactory;
import dao.MateriaPrimaDAO;

public class PedidoProdutoRN implements IPedidoProdutoRN {
	
	private MateriaPrimaDAO materiaPrimaDAO = DAOFactory.getMateriaPrimaDAO();

	@Override
	public List<MateriaPrima> getAll() {
		return materiaPrimaDAO.getAll();
	}

	@Override
	public MateriaPrima searchByKey(Integer chave) {
		return materiaPrimaDAO.searchByKey(chave);
	}

	@Override
	public void insert(MateriaPrima materiaPrima) {
		materiaPrimaDAO.insert(materiaPrima);
	}

	@Override
	public Object update(MateriaPrima materiaPrima) {
		return materiaPrimaDAO.update(materiaPrima);
	}

	@Override
	public void remove(MateriaPrima materiaPrima) {
		materiaPrimaDAO.refresh(materiaPrima);
	}
}
