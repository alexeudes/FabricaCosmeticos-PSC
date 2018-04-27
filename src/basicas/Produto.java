package basicas;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Produto {

	//Atributos
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable=false)
	private String unidadeFornecimento;
	@Column(nullable=false)
	private String status;
	@Column(nullable=false)
	private String descricao;
	
	//Relacionamentos
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idCategoria", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Categoria categoria;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="ProdutoMateriaPrima",
				joinColumns = @JoinColumn(name="idProduto"),
				inverseJoinColumns=@JoinColumn(name ="idMateriaPrima"))
	private Collection <MateriaPrima> materiaPrima;
	
	@OneToMany(mappedBy="produto")
	private Collection <PedidoProduto> pedidoProduto;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idGerDesenvolvimento", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private GerenteDesenvolvimento gerenteDesenvolvimento;
	
	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUnidadeFornecimento() {
		return unidadeFornecimento;
	}
	public void setUnidadeFornecimento(String unidadeFornecimento) {
		this.unidadeFornecimento = unidadeFornecimento;
	}	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Collection<MateriaPrima> getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(Collection<MateriaPrima> materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public Collection<PedidoProduto> getPedidoProduto() {
		return pedidoProduto;
	}
	public void setPedidoProduto(Collection<PedidoProduto> pedidoProduto) {
		this.pedidoProduto = pedidoProduto;
	}
	public GerenteDesenvolvimento getGerenteDesenvolvimento() {
		return gerenteDesenvolvimento;
	}
	public void setGerenteDesenvolvimento(GerenteDesenvolvimento gerenteDesenvolvimento) {
		this.gerenteDesenvolvimento = gerenteDesenvolvimento;
	}
	
}
