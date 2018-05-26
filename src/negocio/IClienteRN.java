package negocio;

import java.util.List;

import basicas.Cliente;

public interface IClienteRN {

	List<Cliente> getAll();

	void insert(Cliente cliente);

	Cliente update(Cliente cliente);

	void remove(Cliente cliente);

	Cliente searchByKey(Integer chave);

}
