package basicas;

import java.util.List;

public class Produto {

	//Atributos
	private int id;
	private String unidadeFornecimento;
	private Categoria categoria;
	private List<MateriaPrima> materiaPrima;
	//private List<PedidoProduto> pedidoProduto;
	private List<Produto> produto;
	private String status;
	private String descricao;
	
	//Getters e Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUnidadeFornecimento() {
		return unidadeFornecimento;
	}
	public void setUnidadeFornecimento(String unidadeFornecimento) {
		this.unidadeFornecimento = unidadeFornecimento;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
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
	public List<MateriaPrima> getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(List<MateriaPrima> materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	
	
}
