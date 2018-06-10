package beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import basicas.Compra;
import basicas.Fornecedor;
import basicas.MateriaPrima;
import negocio.Fachada;

@ManagedBean
public class MateriaPrimaBean {

	//Atributos
	private Integer id;
	private String nome;
	private String descricao;
	private String lote;
	private Date validade;
	private Integer estoqueAtual;
	private Collection<Compra> compra;
	private Fornecedor fornecedor;
	
	private MateriaPrima materiaPrima;
	private Collection<Fornecedor> fornecedores;
	private List<MateriaPrima> materiasPrimas;
	
	private Fachada fachada = Fachada.getInstancia();
	
	//Construtores
	public MateriaPrimaBean() {
		this.compra = new ArrayList<Compra>();
		this.fornecedor = new Fornecedor();
		this.materiaPrima = new MateriaPrima(); 
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
	public Collection<Compra> getCompra() {
		return compra;
	}
	public void setCompra(Collection<Compra> compra) {
		this.compra = compra;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public Collection<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(Collection<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	public List<MateriaPrima> getMateriasPrimas() {
		return materiasPrimas;
	}
	public void setMateriasPrimas(List<MateriaPrima> materiasPrimas) {
		this.materiasPrimas = materiasPrimas;
	}

	//Método que carrega uma lista de Matéria prima ao inicializar a tela
	@PostConstruct
	public void init() {
		this.setFornecedores(new ArrayList<Fornecedor>());
		this.setMateriasPrimas(new ArrayList<MateriaPrima>());
		this.fornecedores = fachada.getAllFornecedor();
		this.materiasPrimas = fachada.getAllMateriaPrima();
	}
	
	//Método para inserir a Matéria-Prima
	public void insert() {
		this.fachada.insertMateriaPrima(this.materiaPrima);
	}
}
