package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public abstract class DAOFactory {

	private static final EntityManagerFactory factory;
	static {
		factory = Persistence.createEntityManagerFactory("fabricacosmeticos");		
	}
	
	public static AtendenteDAO getAtendenteDAO(){
		AtendenteDAO dao = new AtendenteDAO(factory);
		return dao;
	}
	
	public static AtrasoObservacoesDAO getAtrasoObservacoesDAO(){
		AtrasoObservacoesDAO dao = new AtrasoObservacoesDAO(factory);
		return dao;
	}
	
	public static CategoriaDAO getCategoriaDAO(){
		CategoriaDAO dao = new CategoriaDAO(factory);
		return dao;
	}
	
	public static ClienteDAO getClienteDAO(){
		ClienteDAO dao = new ClienteDAO(factory);
		return dao;
	}
	
	public static CompraDAO getCompraDAO(){
		CompraDAO dao = new CompraDAO(factory);
		return dao;
	}
	
	public static FornecedorDAO getFornecedorDAO(){
		FornecedorDAO dao = new FornecedorDAO(factory);
		return dao;
	}
	
	public static GerenteComprasDAO getGerenteComprasDAO(){
		GerenteComprasDAO dao = new GerenteComprasDAO(factory);
		return dao;
	}
	
	public static GerenteDesenvolvimentoDAO getGerenteDesenvolvimentoDAO(){
		GerenteDesenvolvimentoDAO dao = new GerenteDesenvolvimentoDAO(factory);
		return dao;
	}
	
	public static GerenteProducaoDAO getGerenteProducaoDAO(){
		GerenteProducaoDAO dao = new GerenteProducaoDAO(factory);
		return dao;
	}
	
	public static GerenteVendaDAO getGerenteVendaDAO(){
		GerenteVendaDAO dao = new GerenteVendaDAO(factory);
		return dao;
	}
	
	public static MateriaPrimaDAO getMateriaPrimaDAO(){
		MateriaPrimaDAO dao = new MateriaPrimaDAO(factory);
		return dao;
	}
	
	public static OperadorDAO getOperadorDAO(){
		OperadorDAO dao = new OperadorDAO(factory);
		return dao;
	}
	
	public static OrdemProducaoDAO getOrdemProducaoDAO(){
		OrdemProducaoDAO dao = new OrdemProducaoDAO(factory);
		return dao;
	}
	
	public static PedidoDAO getPedidoDAO(){
		PedidoDAO dao = new PedidoDAO(factory);
		return dao;
	}
	
	public static PedidoProdutoDAO getPedidoProdutoDAO(){
		PedidoProdutoDAO dao = new PedidoProdutoDAO(factory);
		return dao;
	}
	
	public static PessoaDAO getPessoaDAO(){
		PessoaDAO dao = new PessoaDAO(factory);
		return dao;
	}
	
	public static ProdutoDAO getProdutoDAO(){
		ProdutoDAO dao = new ProdutoDAO(factory);
		return dao;
	}
	
	public static QuimicoDAO getQuimicoDAO(){
		QuimicoDAO dao = new QuimicoDAO(factory);
		return dao;
	}
}
