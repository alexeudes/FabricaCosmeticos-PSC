package negocio;

import java.util.List;

import basicas.GerenteCompras;
import dao.DAOFactory;
import dao.GerenteComprasDAO;

public class GerenteComprasRN implements IGerenteComprasRN {

	private GerenteComprasDAO gerenteComprasDAO = DAOFactory.getGerenteComprasDAO();
	
	@Override
	public List<GerenteCompras> getAll() {
	  return gerenteComprasDAO.getAll();
	}	
		
	@Override
	public void insert(GerenteCompras gerenteCompras) {
		gerenteComprasDAO.insert(gerenteCompras);
	}
		
	@Override
	public GerenteCompras update(GerenteCompras gerenteCompras) {
		return gerenteComprasDAO.update(gerenteCompras);
	}

	@Override
	public void remove(GerenteCompras gerenteCompras) {
		gerenteComprasDAO.remove(gerenteCompras);
	}
		
	@Override
	public GerenteCompras searchByKey(Integer chave) {
		return gerenteComprasDAO.searchByKey(chave);
	}
	
}
