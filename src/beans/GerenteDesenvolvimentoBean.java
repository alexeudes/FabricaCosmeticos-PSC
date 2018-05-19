package beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.faces.bean.ManagedBean;

import basicas.Produto;

@ManagedBean
public class GerenteDesenvolvimentoBean {
	
	//Atributos
	private Collection <Produto> produto;
	
	//Construtores
	public GerenteDesenvolvimentoBean() {
		this.produto = new ArrayList<Produto>();
	}
	//Getters e Setters
	public Collection<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Collection<Produto> produto) {
		this.produto = produto;
	}
}
