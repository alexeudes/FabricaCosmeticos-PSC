package negocio;

import java.util.List;

import basicas.Compra;

public interface ICompraRN {

	List<Compra> getAll();

	void insert(Compra compra);

	Compra update(Compra compra);

	void remove(Compra compra);

	Compra searchByKey(Integer chave);

}
