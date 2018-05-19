package beans;

import java.util.Collection;

import javax.faces.bean.ManagedBean;

import basicas.Endereco;
import basicas.Pedido;

@ManagedBean
public class ClienteBean {

	//Atributos
	private Integer id;
	private String cnpj;
	private String razaoSocial;
	private String telefone;
	private String email;
	private Collection<Pedido> pedido;
	private Endereco endereco;
	
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
		return pedido;
	}
	public void setPedido(Collection<Pedido> pedido) {
		this.pedido = pedido;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
