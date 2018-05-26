package basicas;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class GerenteProducao extends Pessoa{

	//Relacionamentos
	@OneToMany(mappedBy="gerenteProducao", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection <Pedido> pedido;
	
	//Getters e Setters
	public Collection<Pedido> getPedido() {
		return pedido;
	}

	public void setPedido(Collection<Pedido> pedido) {
		this.pedido = pedido;
	}

	//M�todos
	public void registrarAtrasoProducao() {
		
	}
	
	public void solicitarCompra() {
		
	}
}
