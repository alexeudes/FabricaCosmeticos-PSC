package negocio;

import java.util.List;

import basicas.GerenteProducao;

public interface IGerenteProducaoRN {

	List<GerenteProducao> getAll();

	void insert(GerenteProducao gerenteProducao);

	GerenteProducao update(GerenteProducao gerenteProducao);

	void remove(GerenteProducao gerenteProducao);

	GerenteProducao searchByKey(Integer chave);

}
