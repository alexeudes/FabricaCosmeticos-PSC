package basicas;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Operador extends Pessoa {
	//Atributos
	private Boolean alocado;

	//Relacionamentos
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idOrdemProducao", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private OrdemProducao ordemProducao;
	
	
	//Getters e Setters
	public Boolean getAlocado() {
		return alocado;
	}

	public void setAlocado(Boolean alocado) {
		this.alocado = alocado;
	}
	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}

	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}
	
	//Metodos
	public void criarOrdemProducao() {}
}
