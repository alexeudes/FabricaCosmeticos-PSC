package negocio;

import java.util.List;

import basicas.GerenteDesenvolvimento;
import dao.DAOFactory;
import dao.GerenteDesenvolvimentoDAO;

public class GerenteDesenvolvimentoRN implements IGerenteDesenvolvimentoRN {

	private GerenteDesenvolvimentoDAO gerenteDesenvolvimentoDAO = DAOFactory.getGerenteDesenvolvimentoDAO();
	
	@Override
	public List<GerenteDesenvolvimento> getAll() {
	  return gerenteDesenvolvimentoDAO.getAll();
	}	
		
	@Override
	public void insert(GerenteDesenvolvimento gerenteDesenvolvimento) {
		gerenteDesenvolvimentoDAO.insert(gerenteDesenvolvimento);
	}
		
	@Override
	public GerenteDesenvolvimento update(GerenteDesenvolvimento gerenteDesenvolvimento) {
		return gerenteDesenvolvimentoDAO.update(gerenteDesenvolvimento);
	}

	@Override
	public void remove(GerenteDesenvolvimento gerenteDesenvolvimento) {
		gerenteDesenvolvimentoDAO.remove(gerenteDesenvolvimento);
	}
		
	@Override
	public GerenteDesenvolvimento searchByKey(Integer chave) {
		return gerenteDesenvolvimentoDAO.searchByKey(chave);
	}
	
}
