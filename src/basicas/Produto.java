package basicas;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Produto {

	//Atributos
	@Id
	@GeneratedValue
	private int id;
	@Column(nullable=false)
	private String unidadeFornecimento;
	@Column(nullable=false)
	private String status;
	@Column(nullable=false)
	private String descricao;
	
	@OneToOne
	@JoinColumn(name="idCategoria")
	private Categoria categoria;
	
	@OneToMany(mappedBy="MateriaPrima")
	private Collection <MateriaPrima> materiaPrima;
	
	@OneToMany(mappedBy="PedidoProduto")
	private Collection <PedidoProduto> pedidoProduto;
		
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
}
