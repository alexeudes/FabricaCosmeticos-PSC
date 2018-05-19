package beans;

import javax.faces.bean.ManagedBean;

import basicas.GerenteCompras;
import basicas.MateriaPrima;

@ManagedBean
public class CompraBean {

	//Atributos
	private Integer id;
	private Double preco;
	private Integer quantidade;
	private MateriaPrima materiaPrima;
	private GerenteCompras gerenteCompras;
	
	//Construtores
	public CompraBean(){
		this.gerenteCompras = new GerenteCompras();
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
}
