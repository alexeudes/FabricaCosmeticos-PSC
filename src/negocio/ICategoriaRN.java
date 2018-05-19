package negocio;

import java.util.List;

import basicas.Categoria;

public interface ICategoriaRN {

	List<Categoria> getAll();

	void insert(Categoria categoria);

	Categoria update(Categoria categoria);

	void remove(Categoria categoria);

	Categoria searchByKey(Integer chave);

}
