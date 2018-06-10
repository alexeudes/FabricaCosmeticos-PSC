package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.Collection;

import javax.faces.bean.ManagedBean;

import basicas.Atendente;
import basicas.Cliente;
import basicas.GerenteProducao;
import basicas.GerenteVenda;
import basicas.OrdemProducao;
import basicas.PedidoProduto;

@ManagedBean
public class PedidoBean {

	//Atributos
	private Integer id;
	private Date dataPedido;
	private Date prazoEntrega;
	private String observacao;
	private String status;
	private Cliente cliente;
	private Atendente atendente;
	private GerenteVenda gerenteVenda;
	private GerenteProducao gerenteProducao;
	private Collection<PedidoProduto> pedidoProduto;
	private OrdemProducao ordemProducao;
	
	//Construtores
	public PedidoBean() {
		this.cliente = new Cliente();
		this.atendente = new Atendente();
		this.gerenteVenda = new GerenteVenda();
		this.gerenteProducao = new GerenteProducao();
		this.pedidoProduto = new ArrayList<PedidoProduto>();
		this.ordemProducao = new OrdemProducao();
	}
	
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
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
	public Collection<PedidoProduto> getPedidoProduto() {
		return pedidoProduto;
	}
	public void setPedidoProduto(Collection<PedidoProduto> pedidoProduto) {
		this.pedidoProduto = pedidoProduto;
	}
	public OrdemProducao getOrdemProducao() {
		return ordemProducao;
	}
	public void setOrdemProducao(OrdemProducao ordemProducao) {
		this.ordemProducao = ordemProducao;
	}
	
}
