package negocio;

import java.util.List;

import basicas.Quimico;

public interface IQuimicoRN {
	public List<Quimico> getAll();

	public Quimico searchByKey(Integer chave);

	public void insert (Quimico quimico);

	public Quimico update(Quimico quimico);

	public void remove (Quimico quimico);
}
