package negocio;

import java.util.List;

import basicas.GerenteVenda;

public interface IGerenteVendaRN {

	List<GerenteVenda> getAll();

	void insert(GerenteVenda gerenteVenda);

	GerenteVenda update(GerenteVenda gerenteVenda);

	void remove(GerenteVenda gerenteVenda);

	GerenteVenda searchByKey(Integer chave);
	
}
