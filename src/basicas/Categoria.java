package basicas;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Categoria {

	//Atributos
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)
	private String descricao;
	
	@Column(nullable=false)
	@NotNull
	private String tipo;
	
	//Relacionamentos
	@OneToMany(mappedBy="categoria")
	@Cascade(CascadeType.ALL)
	private Collection<Produto> produto;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idQuimico", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Quimico quimico;
	
	
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
	public Collection<Produto> getProdutos() {
		return produto;
	}
	public void setProdutos(Collection<Produto> produto) {
		this.produto = produto;
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
	public Quimico getQuimico() {
		return quimico;
	}
	public void setQuimico(Quimico quimico) {
		this.quimico = quimico;
	}
	
}
