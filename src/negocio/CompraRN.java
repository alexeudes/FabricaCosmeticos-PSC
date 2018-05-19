package negocio;

import java.util.List;

import basicas.Compra;
import dao.CompraDAO;
import dao.DAOFactory;

public class CompraRN implements ICompraRN {

	private CompraDAO compraDAO = DAOFactory.getCompraDAO();
	
	@Override
	public List<Compra> getAll() {
	  return compraDAO.getAll();
	}	
		
	@Override
	public void insert(Compra compra) {
		compraDAO.insert(compra);
	}
		
	@Override
	public Compra update(Compra compra) {
		return compraDAO.update(compra);
	}

	@Override
	public void remove(Compra compra) {
		compraDAO.remove(compra);
	}
		
	@Override
	public Compra searchByKey(Integer chave) {
		return compraDAO.searchByKey(chave);
	}
}
