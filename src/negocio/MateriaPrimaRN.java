package negocio;

import java.util.List;

import basicas.MateriaPrima;
import dao.DAOFactory;
import dao.MateriaPrimaDAO;

public class MateriaPrimaRN implements IMateriaPrimaRN {
	
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
	public MateriaPrima update(MateriaPrima materiaPrima) {
		return materiaPrimaDAO.update(materiaPrima);
	}

	@Override
	public void remove(MateriaPrima materiaPrima) {
		materiaPrimaDAO.remove(materiaPrima);
	}
}
