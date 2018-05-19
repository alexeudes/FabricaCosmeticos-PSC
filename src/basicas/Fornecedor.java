package basicas;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Fornecedor {

	//Atributos
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable=false,length=14)
	@Size(max = 14 , min = 14)
	@NotNull
	private String cnpj;
	
	@Column(nullable=false)
	@NotNull
	private String razaoSocial;
	
	@Column(nullable=false)
	@NotNull
	private String logradouro;
	
	@Column(nullable=false)
	@NotNull
	private String bairro;
	
	@Column(nullable=false)
	@NotNull
	private String cidade;
	
	@Column(nullable=false,length=2)
	@Size(max = 2 , min = 2)
	@NotNull
	private String estado;
	
	@Column(nullable=false,length=9)
	@Size(max = 9 , min = 9)
	@NotNull
	private String cep;
	
	@Column(nullable=false)
	@NotNull
	private String email;
	
	@Column(nullable=false,length=11)
	@Size(max = 11 , min = 11)
	@NotNull
	private String telefone;
	
	//Relacionamentos
	@OneToMany(mappedBy="fornecedor",fetch = FetchType.LAZY)
	private Collection<MateriaPrima> materiaPrima;
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Collection<MateriaPrima> getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(Collection<MateriaPrima> materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	
}
