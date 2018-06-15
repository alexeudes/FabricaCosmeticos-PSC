package beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import basicas.Categoria;
import basicas.GerenteDesenvolvimento;
import basicas.MateriaPrima;
import basicas.PedidoProduto;
import negocio.Fachada;

@ManagedBean
public class ProdutoBean {

	//Atributos
	private Integer id;
	private String unidadeFornecimento;
	private String status;
	private String descricao;
	private Categoria categoria;
	private MateriaPrima materiaprima;
	private Collection<MateriaPrima> materiaPrima;
	private Collection<PedidoProduto> pedidoProduto;
	private GerenteDesenvolvimento gerenteDesenvolvimento;
	private List<MateriaPrima> materiasPrimas;
	
	private Fachada fachada = Fachada.getInstancia();
	
	public ProdutoBean() {
		this.materiaPrima = new ArrayList<MateriaPrima>();
		this.pedidoProduto = new ArrayList<PedidoProduto>();
		this.gerenteDesenvolvimento = new GerenteDesenvolvimento();
	}
	
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
	public List<MateriaPrima> getMateriasPrimas() {
		return materiasPrimas;
	}
	public void setMateriasPrimas(List<MateriaPrima> materiasPrimas) {
		this.materiasPrimas = materiasPrimas;
	}	
	public MateriaPrima getMateriaprima() {
		return materiaprima;
	}
	public void setMateriaprima(MateriaPrima materiaprima) {
		this.materiaprima = materiaprima;
	}
	
	@PostConstruct
	public void init() {
		this.materiasPrimas = new ArrayList<MateriaPrima>();
		this.materiasPrimas = fachada.getAllMateriaPrima();
	}
}
