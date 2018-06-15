package beans;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import basicas.Cliente;
import basicas.Endereco;
import basicas.MateriaPrima;
import basicas.Pedido;
import negocio.Fachada;

@ManagedBean
public class ClienteBean {

	//Atributos
	private Integer id;
	private String cnpj;
	private String razaoSocial;
	private String telefone;
	private String email;
	private Collection<Pedido> pedidos;
	private Endereco endereco;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String numero;
	private Cliente cliente;
	private Collection<Cliente> clientes;
	
	private Fachada fachada = Fachada.getInstancia();
	
	//Construtores
	public ClienteBean(){
		this.pedidos = new ArrayList<Pedido>();
		this.cliente = new Cliente();
		this.endereco = new Endereco();
		this.cliente.setEndereco(new Endereco());
	}
	
	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<Pedido> getPedido() {
		return pedidos;
	}
	public void setPedido(Collection<Pedido> pedido) {
		this.pedidos = pedido;
	}
	public Collection<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Collection<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Collection<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Collection<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Fachada getFachada() {
		return fachada;
	}

	public void setFachada(Fachada fachada) {
		this.fachada = fachada;
	}
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@PostConstruct
	public void init() {
		this.setClientes(new ArrayList<Cliente>());
		clientes = fachada.getAllCliente();
		
	}
	
	public void insert() {
		this.fachada.insertCliente(cliente);
	}
	
	public void delete(Cliente c) { 
		this.fachada.removeCliente(c);
	}
}
