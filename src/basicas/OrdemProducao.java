package basicas;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrdemProducao {

	//Atributos
	
	@Column(nullable=false)
	private Calendar dataInicio;
	
	@Column(nullable=false)
	private Calendar dataFim;
	
	@OneToOne
	@JoinColumn(name="idPedido")
	@Column(nullable=false)
	private Pedido pedido;
	
	//private Collection<Operador> listaOperador;
	
	@Column(nullable=false)
	private String status;
	
	//Getters e Setters
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFim() {
		return dataFim;
	}
	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}