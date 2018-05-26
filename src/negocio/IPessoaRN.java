package negocio;

import java.util.List;

import basicas.Pessoa;

public interface IPessoaRN {
	
	public List<Pessoa> getAll();

	public Pessoa searchByKey(Integer chave);

	public void insert (Pessoa pessoa);

	public Pessoa update(Pessoa pessoa);

	public void remove (Pessoa pessoa);
}
