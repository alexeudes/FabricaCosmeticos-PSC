package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AtrasoObservacoes {

	
	//Atributos
	@Column(nullable=false)
	private String observacao;

	//Getters e Setters
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
