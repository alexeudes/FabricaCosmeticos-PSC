package negocio;

import java.util.List;

import basicas.Operador;
import dao.DAOFactory;
import dao.OperadorDAO;

public class OperadorRN implements IOperadorRN {
	
	public OperadorDAO operadorDAO = DAOFactory.getOperadorDAO();

	@Override
	public List<Operador> getAll() {
		return operadorDAO.getAll();
	}

	@Override
	public Operador searchByKey(Integer chave) {
		return operadorDAO.searchByKey(chave);
	}

	@Override
	public void insert(Operador operador) {
		operadorDAO.insert(operador);
	}

	@Override
	public Operador update(Operador operador) {
		return operadorDAO.update(operador);
	}

	@Override
	public void remove(Operador operador) {
		operadorDAO.remove(operador);
	}

}
