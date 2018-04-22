package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PedidoProduto {
	
	//Atributos
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	@JoinColumn (name = "idPedido", nullable = false)
	private Pedido pedido;
	@ManyToOne
	@JoinColumn (name = "idProduto", nullable = false)
	private Produto produto;
	@Column (nullable = false)
	private Double preco;
	@Column (nullable = false)
	private Integer quantidade;
	
	//Getters e Setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
}
