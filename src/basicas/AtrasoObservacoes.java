package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AtrasoObservacoes {

	@Id
	private Integer id;
	//Atributos
	@Column(nullable=false)
	private String observacao;

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
