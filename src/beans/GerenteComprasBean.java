package beans;

import java.util.Collection;

import javax.faces.bean.ManagedBean;

import basicas.Compra;

@ManagedBean
public class GerenteComprasBean {
	
	//Atributos
	private Collection <Compra> compra;

	//Getters e Setters
	public Collection<Compra> getCompra() {
		return compra;
	}

	public void setCompra(Collection<Compra> compra) {
		this.compra = compra;
	}
}
