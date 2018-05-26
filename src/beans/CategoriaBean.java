package beans;

import basicas.Produto;

import java.util.ArrayList;
import java.util.Collection;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class CategoriaBean {

	//Atributos
	private Integer id;
	private String descricao;
	private String tipo;
	private Collection<Produto> produto;
	
	//Construtores
	public CategoriaBean(){
		this.produto = new ArrayList<Produto>();
	}
	
	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Collection<Produto> getProduto() {
		return produto;
	}
	public void setProduto(Collection<Produto> produto) {
		this.produto = produto;
	}
}
