package basicas;

import javax.persistence.Column;
import javax.persistence.Entity;
<<<<<<< HEAD
import javax.persistence.FetchType;
=======
import javax.persistence.GeneratedValue;
>>>>>>> e6a260b9b48233c007df55d7371640ede4756f7b
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
public class Compra {

	//Atributos
	@Id
	@GeneratedValue
	private Integer idCompra;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idMateriaPrima",insertable=true,updatable=true)
	@Fetch(FetchMode.JOIN)
	private MateriaPrima materiaPrima;
	
	@Column(nullable=false)
	private Double preco;
	
	@Column(nullable=false)
	private Integer quantidade;
	
	//Getters e Setters
	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}
	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}
