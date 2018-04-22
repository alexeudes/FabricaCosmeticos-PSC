package basicas;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




@Entity
public class Cliente {

	//Atributos
	@Id
	@GeneratedValue	
	private Integer id;
	@Column(length=14, nullable=false)
	private String cnpj;
	@Column(length=200, nullable=false)
	private String razaoSocial;
	@Column(length=11, nullable=false)
	private String telefone;
	@Column(length=40, nullable=false)
	private String email;
	
	@OneToMany(mappedBy="Pedido")
	private Collection <Pedido> pedido;
	
	@OneToOne
	@JoinColumn(name="idEndereco")
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
	public Collection<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(Collection<Endereco> endereco) {
		this.endereco = endereco;
	}
}
