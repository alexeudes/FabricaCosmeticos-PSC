package negocio;

import java.util.List;

import basicas.Fornecedor;

public interface IFornecedorRN {

	List<Fornecedor> getAll();

	void insert(Fornecedor fornecedor);

	Fornecedor update(Fornecedor fornecedor);

	void remove(Fornecedor fornecedor);

	Fornecedor searchByKey(Integer chave);

}
