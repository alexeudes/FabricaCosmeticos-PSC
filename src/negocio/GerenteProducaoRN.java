package negocio;

import basicas.GerenteProducao;
import java.util.List;
import dao.DAOFactory;
import dao.GerenteProducaoDAO;

public class GerenteProducaoRN implements IGerenteProducaoRN {

	private GerenteProducaoDAO gerenteProducaoDAO = DAOFactory.getGerenteProducaoDAO();
	
	@Override
	public List<GerenteProducao> getAll() {
	  return gerenteProducaoDAO.getAll();
	}	
		
	@Override
	public void insert(GerenteProducao gerenteProducao) {
		gerenteProducaoDAO.insert(gerenteProducao);
	}
		
	@Override
	public GerenteProducao update(GerenteProducao gerenteProducao) {
		return gerenteProducaoDAO.update(gerenteProducao);
	}

	@Override
	public void remove(GerenteProducao gerenteProducao) {
		gerenteProducaoDAO.remove(gerenteProducao);
	}
		
	@Override
	public GerenteProducao searchByKey(Integer chave) {
		return gerenteProducaoDAO.searchByKey(chave);
	}
	
}
