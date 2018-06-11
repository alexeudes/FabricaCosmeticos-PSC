package basicas;

import java.util.Collection;
import java.util.Date;
import java.util.List;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class MateriaPrima {

	//Atributos
	@Id
	@GeneratedValue	
	private Integer id;
	
	@Column(nullable = false)
	@NotNull
	private String nome;
	
	@Column(nullable = false)
	@NotNull
	private String descricao;
	
	@Column(nullable = false)
	@NotNull
	private String lote;
	
	@Temporal(TemporalType.DATE)
	private Date validade;
	
	@Column(nullable = false)
	@NotNull
	private Integer estoqueAtual;
	
	//Relacionamentos
	@OneToMany(mappedBy="materiaPrima",fetch = FetchType.LAZY)
	private Collection<Compra> compra;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idFornecedor")
	private Fornecedor fornecedor;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="ProdutoMateriaPrima",
				joinColumns = @JoinColumn(name="idMateriaPrima"),
				inverseJoinColumns=@JoinColumn(name ="idProduto"))
	private List<Produto> produto;
	
	//Constutor
	public MateriaPrima() {
		super();
		this.fornecedor = new Fornecedor();
	}
	
	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLote() {
		return lote;
	}
	public void setLote(String lote) {
		this.lote = lote;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
	public Integer getEstoqueAtual() {
		return estoqueAtual;
	}
	public void setEstoqueAtual(Integer estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	
}
