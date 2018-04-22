package basicas;

import javax.persistence.Entity;

@Entity
public class Operador extends Pessoa {
	
	private Boolean alocado;

	public Boolean getAlocado() {
		return alocado;
	}

	public void setAlocado(Boolean alocado) {
		this.alocado = alocado;
	}
	
	public void criarOrdemProducao() {}
}
