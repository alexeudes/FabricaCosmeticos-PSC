package negocio;

import java.util.List;

import basicas.Operador;

public interface IOperadorRN {
	
	public List<Operador> getAll();

	public Operador searchByKey(Integer chave);

	public void insert (Operador operador);

	public Operador update(Operador operador);

	public void remove (Operador operador);
}
