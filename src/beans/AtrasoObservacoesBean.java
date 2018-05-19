package beans;

import javax.faces.bean.ManagedBean;

import basicas.Pedido;

@ManagedBean
public class AtrasoObservacoesBean {

	//Atributos
	private Integer id;
	private String observacao;
	private Pedido pedido;
	
	//Construtores
	public AtrasoObservacoesBean(){
		this.pedido = new Pedido();
	}
	
	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
