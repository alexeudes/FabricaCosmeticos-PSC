package beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import basicas.Fornecedor;
import basicas.MateriaPrima;
import basicas.Pessoa;
import negocio.Fachada;



@Named("loginBean")
@ManagedBean
@SessionScoped
public class LoginBean implements Serializable{
    
	private String senha;
	private String login;
	private Collection<Pessoa> pessoas;
	private Pessoa pessoa;
	private Fachada fachada = Fachada.getInstancia();
	
	@PostConstruct
	public void init() {
		this.pessoas = new ArrayList<Pessoa>();
		this.pessoas = fachada.getAllPessoa();
	}
	
	public String logar() {
		for(Pessoa pessoa : pessoas) {
			if(pessoa.getLogin().equals(login) && pessoa.getSenha().equals(senha)) {
				pessoa = new Pessoa();
				return "/restricted/index.xhtml?faces-redirect=true";
			}
		}
		FacesContext context = FacesContext.getCurrentInstance();
		context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario e/ou Senha invalidos", null));
		return null;
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "login?faces-redirect=true";
	}
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Collection<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(Collection<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
