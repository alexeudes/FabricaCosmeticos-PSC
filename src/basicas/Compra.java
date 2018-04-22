package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Compra {

	//Atributos
	@Id
	private Integer compra;
	
	@Transient
	@Column(nullable=false)
	private Fornecedor fornecedor;
	
	@Transient
	@Column(nullable=false)
	private MateriaPrima materiaPrima;
	
	@Column(nullable=false)
	private Double preco;
	
	@Column(nullable=false)
	private Integer quantidade;
	
	//Getters e Setters
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
	
}
