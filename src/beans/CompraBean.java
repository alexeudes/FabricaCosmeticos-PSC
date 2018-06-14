package beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import basicas.Compra;
import basicas.Fornecedor;
import basicas.GerenteCompras;
import basicas.MateriaPrima;
import negocio.Fachada;

@ManagedBean
public class CompraBean {

	//Atributos
	private Integer id;
	private Double preco;
	private Integer quantidade;
	private MateriaPrima materiaPrima;
	private GerenteCompras gerenteCompras;
	private List<Compra>compras;
	private Compra compra;
	private Fornecedor fornecedor;	
	private Collection<Fornecedor> fornecedores;
	private Collection<MateriaPrima> materiasPrimas;
	
	private Fachada fachada = Fachada.getInstancia();
	
	//Construtores
	public CompraBean(){
		this.compras = new ArrayList<Compra>();
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
	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public GerenteCompras getGerenteCompras() {
		return gerenteCompras;
	}
	public void setGerenteCompras(GerenteCompras gerenteCompras) {
		this.gerenteCompras = gerenteCompras;
	}
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	
	public Collection<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Collection<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public void setMateriasPrimas(List<MateriaPrima> materiasPrimas) {
		this.materiasPrimas = materiasPrimas;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Collection<MateriaPrima> getMateriasPrimas() {
		return materiasPrimas;
	}
	public void setMateriasPrimas(Collection<MateriaPrima> materiasPrimas) {
		this.materiasPrimas = materiasPrimas;
	}
	public void insert() {
		this.fachada.insertCompra(this.compra);
	}



	
	@PostConstruct
	public void init() {
		this.fornecedores = new ArrayList<Fornecedor>();
		this.materiasPrimas = new ArrayList<MateriaPrima>();
		this.fornecedores = fachada.getAllFornecedor();
		this.materiasPrimas = fachada.getAllMateriaPrima();
	}
	
}
