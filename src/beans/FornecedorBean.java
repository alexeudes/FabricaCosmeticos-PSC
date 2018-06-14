package beans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import basicas.MateriaPrima;
import negocio.Fachada;
import basicas.Fornecedor;

@ManagedBean
public class FornecedorBean {

	// Atributos
	private Integer id;
	private String cnpj;
	private String razaoSocial;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String email;
	private String telefone;
	private Collection<MateriaPrima> materiaPrima;
	private List<Fornecedor> fornecedores;
	private Fornecedor fornecedor;

	private Fachada fachada = Fachada.getInstancia();

	// Construtores
	public FornecedorBean() {
		this.materiaPrima = new ArrayList<MateriaPrima>();
		this.fornecedor = new Fornecedor();
	}

	// Getters e Setters
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

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@PostConstruct
	public void init() {
		this.setFornecedores(new ArrayList<Fornecedor>());
		fornecedores = fachada.getAllFornecedor();
	}

	public void insert() {
		this.fachada.insertFornecedor(this.fornecedor);
	}

	public void delete() {
		this.fachada.removeFornecedor(fornecedor);
	}

}
