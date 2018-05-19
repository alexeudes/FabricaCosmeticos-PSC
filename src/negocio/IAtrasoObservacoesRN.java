package negocio;

import java.util.List;

import basicas.AtrasoObservacoes;

public interface IAtrasoObservacoesRN {
	
	public List<AtrasoObservacoes> getAll();

	public AtrasoObservacoes searchByKey(Integer chave);

	public void insert (AtrasoObservacoes atrasoObservacoes);

	public AtrasoObservacoes update(AtrasoObservacoes atrasoObservacoes);

	public void remove (AtrasoObservacoes atrasoObservacoes);
}
