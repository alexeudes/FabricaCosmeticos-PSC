package basicas;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Pedido {

	//Atributos
	@Id
	@GeneratedValue
	private Integer id;
	@Column (nullable = false)
	private Calendar dataPedido;
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idCliente", nullable = false)
	private Cliente cliente;
	@OneToMany (mappedBy = "pedido", fetch = FetchType.LAZY)
	private Collection<PedidoProduto> pedidoProduto;
	@Column (nullable = false)
	private Calendar prazoEntrega;
	@Column (nullable = true)
	private String observacao;
	@Column (nullable = false)
	private String status;
	
	//Getters e Setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Calendar getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Calendar dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Calendar getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(Calendar prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Collection<PedidoProduto> getPedidoProduto() {
		return pedidoProduto;
	}
	public void setPedidoProduto(Collection<PedidoProduto> pedidoProduto) {
		this.pedidoProduto = pedidoProduto;
	}
}
