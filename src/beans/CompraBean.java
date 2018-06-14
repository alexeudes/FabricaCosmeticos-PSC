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
	
	private Collection<Fornecedor> fornecedores;
	
	
	//Construtores
	public CompraBean(){
		this.compras = new ArrayList<Compra>();
		this.gerenteCompras = new GerenteCompras();
	}
	
	private List<MateriaPrima> materiasPrimas;
	
	private Fachada fachada = Fachada.getInstancia();
	
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
	private void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;		
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

	public List<MateriaPrima> getMateriasPrimas() {
		return materiasPrimas;
	}

	public void setMateriasPrimas(List<MateriaPrima> materiasPrimas) {
		this.materiasPrimas = materiasPrimas;
	}


	
	@PostConstruct
	public void init() {
		this.setCompras(new ArrayList<Compra>());
		compras = fachada.getAllCompra();		
	}
	
	public void insert() {
		this.fachada.insertCompra(this.compra);
	}
}
