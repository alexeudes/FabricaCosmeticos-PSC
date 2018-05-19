package negocio;

import java.util.List;

import basicas.Quimico;
import dao.DAOFactory;
import dao.QuimicoDAO;

public class QuimicoRN implements IQuimicoRN {
	
	private QuimicoDAO quimicoDAO = DAOFactory.getQuimicoDAO();

	@Override
	public List<Quimico> getAll() {
		return quimicoDAO.getAll();
	}

	@Override
	public Quimico searchByKey(Integer chave) {
		return quimicoDAO.searchByKey(chave);
	}

	@Override
	public void insert(Quimico quimico) {
		quimicoDAO.insert(quimico);
	}

	@Override
	public Quimico update(Quimico quimico) {
		return quimicoDAO.update(quimico);
	}

	@Override
	public void remove(Quimico quimico) {
		quimicoDAO.remove(quimico);
	}

}
