package basicas;

import javax.persistence.*;

@Embeddable
public class Endereco {

	//atributos
	@Column(length = 9,nullable = false)
	private String cep;
	
	@Column(nullable= false)
	private String logradouro;
	
	@Column(nullable= false)
	private String numero;
	
	@Column(nullable= false)
	private String bairro;
	
	@Column(nullable= false)
	private String cidade;
	
	@Column(nullable= false,length=2)
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
