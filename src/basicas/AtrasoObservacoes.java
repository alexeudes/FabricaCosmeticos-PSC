package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class AtrasoObservacoes {

	
	//Atributos
	@Id
	@GeneratedValue
	private Integer id;
	@Column(nullable=false)
	private String observacao;
	
	//Relacionamentos
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idPedido", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Pedido pedido;

	//Getters e Setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
