package negocio;

import java.util.List;

import basicas.Atendente;
import dao.AtendenteDAO;
import dao.DAOFactory;

public class AtendenteRN implements IAtendenteRN {
	
	private AtendenteDAO atendenteDAO = DAOFactory.getAtendenteDAO();

	@Override
	public List<Atendente> getAll() {
		return atendenteDAO.getAll();
	}

	@Override
	public Atendente searchByKey(Integer chave) {
		return atendenteDAO.searchByKey(chave);
	}

	@Override
	public void insert(Atendente atendente) {
		atendenteDAO.insert(atendente);
	}

	@Override
	public Atendente update(Atendente atendente) {
		return atendenteDAO.update(atendente);
	}

	@Override
	public void remove(Atendente atendente) {
		atendenteDAO.remove(atendente);
	}

}
