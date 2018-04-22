package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
=======
import javax.persistence.GeneratedValue;
>>>>>>> 911b050cec8492d81fa71c2a149aa4166528e763
import javax.persistence.Id;

@Entity
public class AtrasoObservacoes {

	@Id
<<<<<<< HEAD
	private Integer id;
=======
	@GeneratedValue
	private Integer id;
	
>>>>>>> 911b050cec8492d81fa71c2a149aa4166528e763
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
