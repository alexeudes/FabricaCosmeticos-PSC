package negocio;

import java.util.List;

import basicas.Produto;

public interface IProdutoRN {

	public List<Produto> getAll();
	
	public Produto searchByKey(Integer chave);
	
	public void insert (Produto produto);
	
	public Produto update(Produto produto);
	
	public void remove (Produto produto);
}
