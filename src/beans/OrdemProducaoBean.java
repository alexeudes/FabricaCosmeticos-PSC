package beans;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import basicas.Pedido;
import basicas.Operador;

@ManagedBean
public class OrdemProducaoBean {

	//Atributos
	private Integer id;
	private Calendar dataInicio;
	private Calendar dataFim;
	private String status;
	private Pedido pedido;
	private Collection<Operador> operador;
	
	//Construtores
	public OrdemProducaoBean() {
		this.operador = new ArrayList<Operador>();
	}
	
	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Collection<Operador> getOperador() {
		return operador;
	}
	public void setOperador(Collection<Operador> operador) {
		this.operador = operador;
	}
	
}
