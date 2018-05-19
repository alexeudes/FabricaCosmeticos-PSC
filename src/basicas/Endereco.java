package basicas;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class Endereco {

	//atributos
	@Column(length = 9,nullable = false)
	@Size(max = 9 , min = 9)
	@NotNull
	private String cep;
	
	@Column(nullable= false)
	@NotNull
	private String logradouro;
	
	@Column(nullable= false)
	@NotNull
	private String numero;
	
	@Column(nullable= false)
	@NotNull
	private String bairro;
	
	@Column(nullable= false)
	@NotNull
	private String cidade;
	
	@Column(nullable= false,length=2)
	@Size(max = 2 , min = 2)
	@NotNull
	private String estado;
	
	//Getters e Setters
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
		
}
