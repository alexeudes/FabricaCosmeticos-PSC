package negocio;

import java.util.List;

import basicas.Fornecedor;
import dao.DAOFactory;
import dao.FornecedorDAO;

public class FornecedorRN implements IFornecedorRN {

	private FornecedorDAO fornecedorDAO = DAOFactory.getFornecedorDAO();
	
	@Override
	 public List<Fornecedor> getAll() {
	  return fornecedorDAO.getAll();
	 }	
	
	@Override
	public void insert(Fornecedor fornecedor) {
		fornecedorDAO.insert(fornecedor);
	}
	
	@Override
	public Fornecedor update(Fornecedor fornecedor) {
		return fornecedorDAO.update(fornecedor);
	}

	@Override
	public void remove(Fornecedor fornecedor) {
		fornecedorDAO.remove(fornecedor);
	}
	
	@Override
	public Fornecedor searchByKey(Integer chave) {
		return fornecedorDAO.searchByKey(chave);
	}
}
