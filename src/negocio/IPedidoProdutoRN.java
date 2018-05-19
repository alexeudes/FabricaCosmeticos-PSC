package negocio;

import java.util.List;

import basicas.MateriaPrima;

public interface IPedidoProdutoRN {
	
	public List<MateriaPrima> getAll();

	public MateriaPrima searchByKey(Integer chave);

	public void insert (MateriaPrima materiaPrima);

	public Object update(MateriaPrima materiaPrima);

	public void remove (MateriaPrima materiaPrima);
}
