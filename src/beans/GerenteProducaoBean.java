package beans;

import java.util.Collection;

import javax.faces.bean.ManagedBean;

import basicas.Pedido;

@ManagedBean
public class GerenteProducaoBean {
	
	//Atributos
	private Collection <Pedido> pedido;
	
	//Getters e Setters
	public Collection<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(Collection<Pedido> pedido) {
		this.pedido = pedido;
	}
}
