package beans;

import java.util.Collection;
import basicas.Pedido;
import javax.faces.bean.ManagedBean;



@ManagedBean
public class AtendenteBean {

	//Atributos
	private Collection<Pedido> pedido;

	//Getters e Setters
	public Collection<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(Collection<Pedido> pedido) {
		this.pedido = pedido;
	}
	
}
