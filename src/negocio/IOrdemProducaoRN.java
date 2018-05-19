package negocio;

import java.util.List;

import basicas.OrdemProducao;

public interface IOrdemProducaoRN {

	List<OrdemProducao> getAll();

	void insert(OrdemProducao ordemProducao);

	void remove(OrdemProducao ordemProducao);

	OrdemProducao update(OrdemProducao ordemProducao);

	OrdemProducao searchByKey(Integer chave);

}
