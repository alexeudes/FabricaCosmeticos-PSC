package basicas;

import java.util.Calendar;

public class Pedido {

	//Atributos
	private int id;
	private Calendar dataPedido;
	private Cliente cliente;
	//private List<PedidoProduto> pedidoProduto;
	private Calendar prazoEntrega;
	private String observacao;
	private String status;
	
	//Getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	
	
}
