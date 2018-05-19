package beans;

import java.util.Collection;
import javax.faces.bean.ManagedBean;
import basicas.Categoria;

@ManagedBean
public class QuimicoBean {

	//Atributos
	private Collection<Categoria> categoria;

	//Getters e Setters
	public Collection<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(Collection<Categoria> categoria) {
		this.categoria = categoria;
	}
	
}
