package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Pessoa {

	//Atributos
	@Id
	@GeneratedValue
	public Integer id;
	
	@Column (nullable = false, length = 11)
	@Size(max = 11 , min = 11)
	@NotNull
	public String cpf;
	
	@Column (nullable = false)
	@NotNull
	public String nome;
	
	@Column (nullable = false, length = 11)
	@Size(max = 11 , min = 11)
	@NotNull
	public String telefone;
	
	@Column (nullable = false)
	@NotNull
	public String email;
	
	@Column (nullable = false)
	@NotNull
	public String login;
	
	@Column (nullable = false)
	@NotNull
	public String senha;
	
	//Getters e Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
