package negocio;

import java.util.List;

import basicas.Atendente;

public interface IAtendenteRN {
	
	public List<Atendente> getAll();

	public Atendente searchByKey(Integer chave);

	public void insert (Atendente atendente);

	public Atendente update(Atendente atendente);

	public void remove (Atendente atendente);
}
