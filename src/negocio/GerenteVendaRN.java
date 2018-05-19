package negocio;

import java.util.List;

import basicas.GerenteVenda;
import dao.DAOFactory;
import dao.GerenteVendaDAO;

public class GerenteVendaRN implements IGerenteVendaRN {

private GerenteVendaDAO gerenteVendaDAO = DAOFactory.getGerenteVendaDAO();
	
	@Override
	public List<GerenteVenda> getAll() {
	  return gerenteVendaDAO.getAll();
	}	
		
	@Override
	public void insert(GerenteVenda gerenteVenda) {
		gerenteVendaDAO.insert(gerenteVenda);
	}
		
	@Override
	public GerenteVenda update(GerenteVenda gerenteVenda) {
		return gerenteVendaDAO.update(gerenteVenda);
	}

	@Override
	public void remove(GerenteVenda gerenteVenda) {
		gerenteVendaDAO.remove(gerenteVenda);
	}
		
	@Override
	public GerenteVenda searchByKey(Integer chave) {
		return gerenteVendaDAO.searchByKey(chave);
	}
	
}
