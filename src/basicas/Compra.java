package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Compra {

	//Atributos
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false)
	@NotNull
	private Double preco;
	
	@Column(nullable=false)
	@NotNull
	private Integer quantidade;
	
	//Relacionamentos
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idMateriaPrima",insertable=true,updatable=true)
	@Fetch(FetchMode.JOIN)
	private MateriaPrima materiaPrima;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idGerCompra", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private GerenteCompras gerenteCompras;
	
	//Getters e Setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public GerenteCompras getGerenteCompras() {
		return gerenteCompras;
	}
	public void setGerenteCompras(GerenteCompras gerenteCompras) {
		this.gerenteCompras = gerenteCompras;
	}
	
}
