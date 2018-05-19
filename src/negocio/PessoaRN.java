package negocio;

import java.util.List;

import basicas.Pessoa;
import dao.DAOFactory;
import dao.PessoaDAO;

public class PessoaRN implements IPessoaRN {
	
	private PessoaDAO pessoaDAO = DAOFactory.getPessoaDAO();

	@Override
	public List<Pessoa> getAll() {
		return pessoaDAO.getAll();
	}

	@Override
	public Pessoa searchByKey(Integer chave) {
		return pessoaDAO.searchByKey(chave);
	}

	@Override
	public void insert(Pessoa pessoa) {
		pessoaDAO.insert(pessoa);
	}

	@Override
	public Pessoa update(Pessoa pessoa) {
		return pessoaDAO.update(pessoa);
	}

	@Override
	public void remove(Pessoa pessoa) {
		pessoaDAO.remove(pessoa);
	}

}
