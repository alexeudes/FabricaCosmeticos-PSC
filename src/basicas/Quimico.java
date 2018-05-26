package basicas;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Quimico extends Pessoa{
	
	//Relacionamentos
	@OneToMany(mappedBy="quimico", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection <Categoria> Categoria;
	
	//Getter e Setters
	public Collection<Categoria> getCategoria() {
		return Categoria;
	}

	public void setCategoria(Collection<Categoria> categoria) {
		Categoria = categoria;
	}
	

	

}
