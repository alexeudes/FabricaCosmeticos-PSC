package beans;

import javax.faces.bean.ManagedBean;

import basicas.Pedido;
import basicas.Produto;

@ManagedBean
public class PedidoProdutoBean {

	//Atributos
	private Integer id;
	private Double preco;
	private Integer quantidade;
	private Pedido pedido;
	private Produto produto;
	
	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
}
