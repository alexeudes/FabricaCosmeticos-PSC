package negocio;

import java.util.List;

import basicas.MateriaPrima;
import dao.DAOFactory;
import dao.MateriaPrimaDAO;

public class MateriaPrimaRN implements IMateriaPrimaRN {
	
	private MateriaPrimaDAO materiaprimaDAO = DAOFactory.getMateriaPrimaDAO();

	@Override
	public List<MateriaPrima> getAll() {
		return materiaprimaDAO.getAll();
	}
	
	@Override
	public MateriaPrima searchByKey(Integer chave) {
		return materiaprimaDAO.searchByKey(chave);
	}

	@Override
	public void insert(MateriaPrima materiaPrima) {
		materiaprimaDAO.insert(materiaPrima);
	}
	
	@Override
	public MateriaPrima update(MateriaPrima materiaPrima) {
		return materiaprimaDAO.update(materiaPrima);
	}

	@Override
	public void remove(MateriaPrima materiaPrima) {
		materiaprimaDAO.remove(materiaPrima);
	}
}
