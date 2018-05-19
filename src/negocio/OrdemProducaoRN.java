package negocio;

import java.util.List;

import basicas.OrdemProducao;
import dao.DAOFactory;
import dao.OrdemProducaoDAO;

public class OrdemProducaoRN implements IOrdemProducaoRN {

	private OrdemProducaoDAO ordemProducaoDAO = DAOFactory.getOrdemProducaoDAO();
	
	@Override
	public List<OrdemProducao> getAll() {
	  return ordemProducaoDAO.getAll();
	}	
		
	@Override
	public void insert(OrdemProducao ordemProducao) {
		ordemProducaoDAO.insert(ordemProducao);
	}
		
	@Override
	public OrdemProducao update(OrdemProducao ordemProducao) {
		return ordemProducaoDAO.update(ordemProducao);
	}

	@Override
	public void remove(OrdemProducao ordemProducao) {
		ordemProducaoDAO.remove(ordemProducao);
	}
		
	@Override
	public OrdemProducao searchByKey(Integer chave) {
		return ordemProducaoDAO.searchByKey(chave);
	}
}
