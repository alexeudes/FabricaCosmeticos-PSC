package beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.faces.bean.ManagedBean;

import basicas.Operador;
import basicas.Pedido;

@ManagedBean
public class OrdemProducaoBean {

	//Atributos
	private Integer id;
	private Date dataInicio;
	private Date dataFim;
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
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
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
