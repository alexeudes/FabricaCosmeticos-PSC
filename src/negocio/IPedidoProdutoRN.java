package negocio;

import java.util.List;

import basicas.PedidoProduto;

public interface IPedidoProdutoRN {
	
	public List<PedidoProduto> getAll();

	public PedidoProduto searchByKey(Integer chave);

	public void insert (PedidoProduto pedidoProduto);

	public PedidoProduto update(PedidoProduto pedidoProduto);

	public void remove (PedidoProduto pedidoProduto);
}
