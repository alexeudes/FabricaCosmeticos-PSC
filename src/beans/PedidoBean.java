package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import basicas.Atendente;
import basicas.Cliente;
import basicas.Fornecedor;
import basicas.GerenteProducao;
import basicas.GerenteVenda;
import basicas.MateriaPrima;
import basicas.OrdemProducao;
import basicas.Pedido;
import basicas.PedidoProduto;
import basicas.Produto;
import negocio.Fachada;

@ManagedBean
public class PedidoBean {

	//Atributos
	private Integer id;
	private Date dataPedido;
	private Date prazoEntrega;
	private String observacao;
	private String status;

	private Atendente atendente;
	private GerenteVenda gerenteVenda;
	private GerenteProducao gerenteProducao;
	private OrdemProducao ordemProducao;
	
	private Pedido pedido;
	private List<Pedido> pedidos;
	private Cliente cliente;
	private Collection<Cliente> clientes;
	private Collection<PedidoProduto> pedidoProduto;
	private Collection<Produto> produtos;
	
	private Fachada fachada = Fachada.getInstancia();
	
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Collection<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Collection<Cliente> clientes) {
		this.clientes = clientes;
	}
	public Collection<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(Collection<Produto> produtos) {
		this.produtos = produtos;
	}

		//Método que carrega uma lista de cliente e produtos ao inicializar a tela
		@PostConstruct
		public void init() {
			this.setClientes(new ArrayList<Cliente>());
			this.setProdutos(new ArrayList<Produto>());
			this.clientes = fachada.getAllCliente();
			this.produtos = fachada.getAllProduto();
		}
		
		//Método para inserir o pedido
		public void insert() {
			this.fachada.insertPedido(this.pedido);
		}
		
		public void delete(MateriaPrima mp) { 
			this.fachada.removeMateriaPrima(mp);
		}
	
}
