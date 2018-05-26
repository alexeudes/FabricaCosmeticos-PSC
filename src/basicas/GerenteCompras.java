package basicas;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class GerenteCompras extends Pessoa {
	
	//Relacionamentos
	@OneToMany(mappedBy="gerenteCompras", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection <Compra> compra;

	//Getters e Setters
	public Collection<Compra> getCompra() {
		return compra;
	}

	public void setCompra(Collection<Compra> compra) {
		this.compra = compra;
	}
	
	
	
}
