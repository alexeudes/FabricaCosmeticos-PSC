package negocio;

import java.util.List;

import basicas.AtrasoObservacoes;
import dao.AtrasoObservacoesDAO;
import dao.DAOFactory;

public class AtrasoObservacoesRN implements IAtrasoObservacoesRN {
	
	private AtrasoObservacoesDAO atrasoObservacoesDAO = DAOFactory.getAtrasoObservacoesDAO();

	@Override
	public List<AtrasoObservacoes> getAll() {
		return atrasoObservacoesDAO.getAll();
	}

	@Override
	public AtrasoObservacoes searchByKey(Integer chave) {
		return atrasoObservacoesDAO.searchByKey(chave);
	}

	@Override
	public void insert(AtrasoObservacoes atrasoObservacoes) {
		atrasoObservacoesDAO.insert(atrasoObservacoes);
	}

	@Override
	public AtrasoObservacoes update(AtrasoObservacoes atrasoObservacoes) {
		return atrasoObservacoesDAO.update(atrasoObservacoes);
	}

	@Override
	public void remove(AtrasoObservacoes atrasoObservacoes) {
		atrasoObservacoesDAO.remove(atrasoObservacoes);
	}
}
