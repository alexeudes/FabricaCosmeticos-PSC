package basicas;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Pedido {

	//Atributos
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column (nullable = false)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date dataPedido;
	
	@Column (nullable = false)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date prazoEntrega;
	
	@Column (nullable = true)
	@Null
	private String observacao;
	
	@Column (nullable = false)
	@Null
	private String status;
	
	//Relacionamentos
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idCliente", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Cliente cliente;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idAtendente", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private Atendente atendente;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idGerVenda", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private GerenteVenda gerenteVenda;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "idGerProducao", nullable = false)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
	private GerenteProducao gerenteProducao;
	
	@OneToMany (mappedBy = "pedido", fetch = FetchType.LAZY)
	private Collection<PedidoProduto> pedidoProduto;
	
	@OneToOne(mappedBy = "pedido")
	@Cascade(CascadeType.ALL)
	private OrdemProducao ordemProducao;
	
	@OneToMany(mappedBy="pedido", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection <AtrasoObservacoes> atrasoObservacoes;
	
	//Getters e Setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getPrazoEntrega() {
		return prazoEntrega;
	}
	public void setPrazoEntrega(Date prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Collection<PedidoProduto> getPedidoProduto() {
		return pedidoProduto;
	}
	public void setPedidoProduto(Collection<PedidoProduto> pedidoProduto) {
		this.pedidoProduto = pedidoProduto;
	}
	public Atendente getAtendente() {
		return atendente;
	}
	public void setAtendente(Atendente atendente) {
		this.atendente = atendente;
	}
	public GerenteVenda getGerenteVenda() {
		return gerenteVenda;
	}
	public void setGerenteVenda(GerenteVenda gerenteVenda) {
		this.gerenteVenda = gerenteVenda;
	}
	public GerenteProducao getGerenteProducao() {
		return gerenteProducao;
	}
	public void setGerenteProducao(GerenteProducao gerenteProducao) {
		this.gerenteProducao = gerenteProducao;
	}
	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}
	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}
	
}
