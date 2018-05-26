package beans;

import javax.faces.bean.ManagedBean;

import basicas.OrdemProducao;

@ManagedBean
public class OperadorBean {

	//Atributos
	private Boolean alocado;
	private OrdemProducao ordemProducao;
	
	//Construtores
	public OperadorBean() {
		this.ordemProducao = new OrdemProducao();
	}
	
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
}
