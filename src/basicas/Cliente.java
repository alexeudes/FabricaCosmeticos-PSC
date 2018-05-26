package basicas;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;




@Entity
public class Cliente {

	//Atributos
	@Id
	@GeneratedValue	
	private Integer id;
	
	@Column(length=14, nullable=false)
	@Size(max = 14 , min = 14)
	@NotNull
	private String cnpj;
	
	@Column(nullable=false)
	@NotNull
	private String razaoSocial;
	
	@Column(length=11, nullable=false)
	@Size(max = 11 , min = 11)
	@NotNull
	private String telefone;
	
	@Column(nullable=false)
	@NotNull
	private String email;
	
	//Relacionamentos
	@OneToMany(mappedBy="cliente", fetch = FetchType.LAZY)
	@Cascade(CascadeType.ALL)
	private Collection <Pedido> pedido;
	
	@Embedded
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
