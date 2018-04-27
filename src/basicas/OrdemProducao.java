package basicas;

import java.util.Calendar;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class OrdemProducao {

	//Atributos
	@Id
	@GeneratedValue
	private Integer id;	
	@Column(nullable=false)
	private Calendar dataInicio;	
	@Column(nullable=false)
	private Calendar dataFim;	
	@Column(nullable=false)
	private String status;
	
	//Relacionamentos
	@OneToOne
	@JoinColumn(name="idPedido", nullable=false)
	private Pedido pedido;
	
	@OneToMany(mappedBy="ordemProducao", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection<Operador> operador;
	
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
	public Collection<Operador> getOperador() {
		return operador;
	}
	public void setOperador(Collection<Operador> operador) {
		this.operador = operador;
	}

}
