package beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;

import basicas.Pedido;

@ManagedBean
public class GerenteVendaBean {
	//Atributos
	private Collection <Pedido> pedido;

	//Construtores
	public GerenteVendaBean() {
		this.pedido = new ArrayList<Pedido>();
	}
	//Getters e Setters
	public Collection<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(Collection<Pedido> pedido) {
		this.pedido = pedido;
	}
}
