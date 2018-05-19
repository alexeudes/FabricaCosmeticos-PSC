package beans;

import java.util.Calendar;
import java.util.Collection;

import javax.faces.bean.ManagedBean;

import basicas.Compra;
import basicas.Fornecedor;

@ManagedBean
public class MateriaPrimaBean {

	//Atributos
	private Integer id;
	private String nome;
	private String descricao;
	private String lote;
	private Calendar validade;
	private Integer estoqueAtual;
	private Collection<Compra> compra;
	private Fornecedor fornecedor;
	
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
	public Calendar getValidade() {
		return validade;
	}
	public void setValidade(Calendar validade) {
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
	
}
