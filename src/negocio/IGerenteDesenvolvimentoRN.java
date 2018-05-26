package negocio;

import java.util.List;

import basicas.GerenteDesenvolvimento;

public interface IGerenteDesenvolvimentoRN {

	List<GerenteDesenvolvimento> getAll();

	void insert(GerenteDesenvolvimento gerenteDesenvolvimento);

	GerenteDesenvolvimento update(GerenteDesenvolvimento gerenteDesenvolvimento);

	void remove(GerenteDesenvolvimento gerenteDesenvolvimento);

	GerenteDesenvolvimento searchByKey(Integer chave);

}
