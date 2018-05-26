package basicas;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class GerenteDesenvolvimento extends Pessoa {
	//Relacionamentos
	@OneToMany(mappedBy="gerenteDesenvolvimento", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection <Produto> produto;
	
	//Getters e Setters

	public Collection<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Collection<Produto> produto) {
		this.produto = produto;
	}
	
	//Metodos
	public void alterarStatus(Produto produto) {}

}
