package negocio;

import java.util.List;

import basicas.GerenteCompras;

public interface IGerenteComprasRN {

	List<GerenteCompras> getAll();

	void insert(GerenteCompras gerenteCompras);

	GerenteCompras update(GerenteCompras gerenteCompras);

	void remove(GerenteCompras gerenteCompras);

	GerenteCompras searchByKey(Integer chave);

}
