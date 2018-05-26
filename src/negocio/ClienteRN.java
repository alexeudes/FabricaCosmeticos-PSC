package negocio;

import java.util.List;

import basicas.Cliente;
import dao.ClienteDAO;
import dao.DAOFactory;

public class ClienteRN implements IClienteRN {

	private ClienteDAO clienteDAO = DAOFactory.getClienteDAO();
	
	@Override
	public List<Cliente> getAll() {
	  return clienteDAO.getAll();
	}	
		
	@Override
	public void insert(Cliente cliente) {
		clienteDAO.insert(cliente);
	}
		
	@Override
	public Cliente update(Cliente cliente) {
		return clienteDAO.update(cliente);
	}

	@Override
	public void remove(Cliente cliente) {
		clienteDAO.remove(cliente);
	}
		
	@Override
	public Cliente searchByKey(Integer chave) {
		return clienteDAO.searchByKey(chave);
	}
}
