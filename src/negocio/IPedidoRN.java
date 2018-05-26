package negocio;

import java.util.List;

import basicas.Pedido;

public interface IPedidoRN {
	
	public List<Pedido> getAll();

	public Pedido searchByKey(Integer chave);

	public void insert (Pedido pedido);

	public Pedido update(Pedido pedido);

	public void remove (Pedido pedido);
}
