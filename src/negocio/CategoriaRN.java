package negocio;

import java.util.List;

import basicas.Categoria;
import dao.CategoriaDAO;
import dao.DAOFactory;

public class CategoriaRN implements ICategoriaRN {

	private CategoriaDAO categoriaDAO = DAOFactory.getCategoriaDAO();
	
	@Override
	public List<Categoria> getAll() {
		  return categoriaDAO.getAll();
	}	
		
	@Override
	public void insert(Categoria categoria) {
		categoriaDAO.insert(categoria);
	}
		
	@Override
	public Categoria update(Categoria categoria) {
		return categoriaDAO.update(categoria);
	}
	
	@Override
	public void remove(Categoria categoria) {
		categoriaDAO.remove(categoria);
	}
	
	@Override
	public Categoria searchByKey(Integer chave) {
		return categoriaDAO.searchByKey(chave);
	}
}
