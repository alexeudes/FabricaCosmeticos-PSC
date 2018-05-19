package beans;

import java.util.Collection;

import javax.faces.bean.ManagedBean;

import basicas.Produto;

@ManagedBean
public class GerenteDesenvolvimentoBean {
	//Atributos
	private Collection <Produto> produto;
	
	//Getters e Setters
	public Collection<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Collection<Produto> produto) {
		this.produto = produto;
	}
}
