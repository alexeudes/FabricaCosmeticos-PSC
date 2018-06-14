package negocio;

import java.util.List;

import basicas.Atendente;
import basicas.AtrasoObservacoes;
import basicas.Categoria;
import basicas.Cliente;
import basicas.Compra;
import basicas.Fornecedor;
import basicas.GerenteCompras;
import basicas.GerenteDesenvolvimento;
import basicas.GerenteProducao;
import basicas.GerenteVenda;
import basicas.MateriaPrima;
import basicas.Operador;
import basicas.OrdemProducao;
import basicas.Pedido;
import basicas.PedidoProduto;
import basicas.Pessoa;
import basicas.Produto;
import basicas.Quimico;

public class Fachada {

	private static Fachada instancia;
	private static IAtendenteRN atendenteRN;
	private static IAtrasoObservacoesRN atrasoObservacoesRN;
	private static ICategoriaRN categoriaRN;
	private static IClienteRN clienteRN;
	private static ICompraRN compraRN;
	private static IFornecedorRN fornecedorRN;
	private static IGerenteComprasRN gerenteComprasRN;
	private static IGerenteDesenvolvimentoRN gerenteDesenvolvimentoRN;
	private static IGerenteProducaoRN gerenteProducaoRN;
	private static IGerenteVendaRN gerenteVendaRN;
	private static IMateriaPrimaRN materiaPrimaRN;
	private static IOperadorRN operadorRN;
	private static IOrdemProducaoRN ordemProducaoRN;
	private static IPedidoProdutoRN pedidoProdutoRN;
	private static IPedidoRN pedidoRN;
	private static IPessoaRN pessoaRN;
	private static IProdutoRN produtoRN;
	private static IQuimicoRN quimicoRN;

	private Fachada() {
		super();
		atendenteRN = new AtendenteRN();
		atrasoObservacoesRN = new AtrasoObservacoesRN();
		categoriaRN = new CategoriaRN();
		clienteRN = new ClienteRN();
		compraRN = new CompraRN();
		fornecedorRN = new FornecedorRN();
		gerenteComprasRN = new GerenteComprasRN();
		gerenteDesenvolvimentoRN = new GerenteDesenvolvimentoRN();
		gerenteProducaoRN = new GerenteProducaoRN();
		gerenteVendaRN = new GerenteVendaRN();
		materiaPrimaRN = new MateriaPrimaRN();
		operadorRN = new OperadorRN();
		ordemProducaoRN = new OrdemProducaoRN();
		pedidoProdutoRN = new PedidoProdutoRN();
		pedidoRN = new PedidoRN();
		pessoaRN = new PessoaRN();
		produtoRN = new ProdutoRN();
		quimicoRN = new QuimicoRN();
	}

	public static Fachada getInstancia() {
		if (instancia == null) {
			instancia = new Fachada();
		}
		return instancia;
	}

	// Ações Atendente
	public List<Atendente> getAllAtendente() {
		return atendenteRN.getAll();
	}

	public Atendente searchByKeyAtendente(Integer chave) {
		return atendenteRN.searchByKey(chave);
	}

	public void insertAtendente(Atendente atendente) {
		atendenteRN.insert(atendente);
	}

	public Atendente updateAtendente(Atendente atendente) {
		return atendenteRN.update(atendente);
	}

	public void removeAtendente(Atendente atendente) {
		atendenteRN.remove(atendente);
	}

	// Ações Atraso Observações
	public List<AtrasoObservacoes> getAllAtrasoObservacoes() {
		return atrasoObservacoesRN.getAll();
	}

	public AtrasoObservacoes searchByKeyAtrasoObservacoes(Integer chave) {
		return atrasoObservacoesRN.searchByKey(chave);
	}

	public void insertAtrasoObservacoes(AtrasoObservacoes atrasoObservacoes) {
		atrasoObservacoesRN.insert(atrasoObservacoes);
	}

	public AtrasoObservacoes updateAtrasoObservacoes(AtrasoObservacoes atrasoObservacoes) {
		return atrasoObservacoesRN.update(atrasoObservacoes);
	}

	public void removeAtrasoObservacoes(AtrasoObservacoes atrasoObservacoes) {
		atrasoObservacoesRN.remove(atrasoObservacoes);
	}

	// Ações Categoria
	public List<Categoria> getAllCategoria() {
		return categoriaRN.getAll();
	}

	public void insertCategoria(Categoria categoria) {
		categoriaRN.insert(categoria);
	}

	public Categoria updateCategoria(Categoria categoria) {
		return categoriaRN.update(categoria);
	}

	public void removeCategoria(Categoria categoria) {
		categoriaRN.remove(categoria);
	}

	public Categoria searchByKeyCategoria(Integer chave) {
		return categoriaRN.searchByKey(chave);
	}

	// Ações Cliente
	public List<Cliente> getAllCliente() {
		return clienteRN.getAll();
	}

	public void insertCliente(Cliente cliente) {
		clienteRN.insert(cliente);
	}

	public Cliente updateCliente(Cliente cliente) {
		return clienteRN.update(cliente);
	}

	public void removeCliente(Cliente cliente) {
		clienteRN.remove(cliente);
	}

	public Cliente searchByKeyCliente(Integer chave) {
		return clienteRN.searchByKey(chave);
	}

	// Ações Compra
	public List<Compra> getAllCompra() {
		return compraRN.getAll();
	}

	public void insertCompra(Compra compra) {
		compraRN.insert(compra);
	}

	public Compra updateCompra(Compra compra) {
		return compraRN.update(compra);
	}

	public void removeCompra(Compra compra) {
		compraRN.remove(compra);
	}

	public Compra searchByKeyCompra(Integer chave) {
		return compraRN.searchByKey(chave);
	}

	// Ações Fornecedor
	public List<Fornecedor> getAllFornecedor() {
		return fornecedorRN.getAll();
	}

	public void insertFornecedor(Fornecedor fornecedor) {
		fornecedorRN.insert(fornecedor);
	}

	public Fornecedor updateFornecedor(Fornecedor fornecedor) {
		return fornecedorRN.update(fornecedor);
	}

	public void removeFornecedor(Fornecedor fornecedor) {
		fornecedorRN.remove(fornecedor);
	}

	public Fornecedor searchByKeyFornecedor(Integer chave) {
		return fornecedorRN.searchByKey(chave);
	}

	// Ações Gerente Compras
	public List<GerenteCompras> getAllGerenteCompras() {
		return gerenteComprasRN.getAll();
	}

	public void insertGerenteCompras(GerenteCompras gerenteCompras) {
		gerenteComprasRN.insert(gerenteCompras);
	}

	public GerenteCompras updateGerenteCompras(GerenteCompras gerenteCompras) {
		return gerenteComprasRN.update(gerenteCompras);
	}

	public void removeGerenteCompras(GerenteCompras gerenteCompras) {
		gerenteComprasRN.remove(gerenteCompras);
	}

	public GerenteCompras searchByKeyGerenteCompras(Integer chave) {
		return gerenteComprasRN.searchByKey(chave);
	}

	// Ações Gerente Desenvolvimento
	public List<GerenteDesenvolvimento> getAllGerenteDesenvolvimento() {
		return gerenteDesenvolvimentoRN.getAll();
	}

	public void insertGerenteDesenvolvimento(GerenteDesenvolvimento gerenteDesenvolvimento) {
		gerenteDesenvolvimentoRN.insert(gerenteDesenvolvimento);
	}

	public GerenteDesenvolvimento updateGerenteDesenvolvimento(GerenteDesenvolvimento gerenteDesenvolvimento) {
		return gerenteDesenvolvimentoRN.update(gerenteDesenvolvimento);
	}

	public void removeGerenteDesenvolvimento(GerenteDesenvolvimento gerenteDesenvolvimento) {
		gerenteDesenvolvimentoRN.remove(gerenteDesenvolvimento);
	}

	public GerenteDesenvolvimento searchByKeyGerenteDesenvolvimento(Integer chave) {
		return gerenteDesenvolvimentoRN.searchByKey(chave);
	}

	// Ações Gerente Produção
	public List<GerenteProducao> getAllGerenteProducao() {
		return gerenteProducaoRN.getAll();
	}

	public void insertGerenteProducao(GerenteProducao gerenteProducao) {
		gerenteProducaoRN.insert(gerenteProducao);
	}

	public GerenteProducao updateGerenteProducao(GerenteProducao gerenteProducao) {
		return gerenteProducaoRN.update(gerenteProducao);
	}

	public void removeGerenteProducao(GerenteProducao gerenteProducao) {
		gerenteProducaoRN.remove(gerenteProducao);
	}

	public GerenteProducao searchByKeyGerenteProducao(Integer chave) {
		return gerenteProducaoRN.searchByKey(chave);
	}

	// Ações Gerente Vendas
	public List<GerenteVenda> getAllGerenteVenda() {
		return gerenteVendaRN.getAll();
	}

	public void insertGerenteVenda(GerenteVenda gerenteVenda) {
		gerenteVendaRN.insert(gerenteVenda);
	}

	public GerenteVenda updateGerenteVenda(GerenteVenda gerenteVenda) {
		return gerenteVendaRN.update(gerenteVenda);
	}

	public void removeGerenteVenda(GerenteVenda gerenteVenda) {
		gerenteVendaRN.remove(gerenteVenda);
	}

	public GerenteVenda searchByKeyGerenteVenda(Integer chave) {
		return gerenteVendaRN.searchByKey(chave);
	}

	// Ações Matéria Prima
	public List<MateriaPrima> getAllMateriaPrima() {
		return materiaPrimaRN.getAll();
	}

	public MateriaPrima searchByKeyMateriaPrima(Integer chave) {
		return materiaPrimaRN.searchByKey(chave);
	}

	public void insertMateriaPrima(MateriaPrima materiaPrima) {
		materiaPrimaRN.insert(materiaPrima);
	}

	public MateriaPrima updateMateriaPrima(MateriaPrima materiaPrima) {
		return materiaPrimaRN.update(materiaPrima);
	}

	public void removeMateriaPrima(MateriaPrima materiaPrima) {
		materiaPrimaRN.remove(materiaPrima);
	}

	// Ações Operador
	public List<Operador> getAllOperador() {
		return operadorRN.getAll();
	}

	public Operador searchByKeyOperador(Integer chave) {
		return operadorRN.searchByKey(chave);
	}

	public void insertOperador(Operador operador) {
		operadorRN.insert(operador);
	}

	public Operador updateOperador(Operador operador) {
		return operadorRN.update(operador);
	}

	public void removeOperador(Operador operador) {
		operadorRN.remove(operador);
	}

	// Ações Ordem Produção
	public List<OrdemProducao> getAllOrdemProducao() {
		return ordemProducaoRN.getAll();
	}

	public void insertOrdemProducao(OrdemProducao ordemProducao) {
		ordemProducaoRN.insert(ordemProducao);
	}

	public OrdemProducao updateOrdemProducao(OrdemProducao ordemProducao) {
		return ordemProducaoRN.update(ordemProducao);
	}

	public void removeOrdemProducao(OrdemProducao ordemProducao) {
		ordemProducaoRN.remove(ordemProducao);
	}

	public OrdemProducao searchByKeyOrdemProducao(Integer chave) {
		return ordemProducaoRN.searchByKey(chave);
	}

	// Ações Pedido Produto
	public List<PedidoProduto> getAllPedidoProduto() {
		return pedidoProdutoRN.getAll();
	}

	public PedidoProduto searchByKeyPedidoProduto(Integer chave) {
		return pedidoProdutoRN.searchByKey(chave);
	}

	public void insertPedidoProduto(PedidoProduto pedidoProduto) {
		pedidoProdutoRN.insert(pedidoProduto);
	}

	public PedidoProduto updatePedidoProduto(PedidoProduto pedidoProduto) {
		return pedidoProdutoRN.update(pedidoProduto);
	}

	public void removePedidoProduto(PedidoProduto pedidoProduto) {
		pedidoProdutoRN.remove(pedidoProduto);
	}

	// Ações Pedido
	public List<Pedido> getAllPedido() {
		return pedidoRN.getAll();
	}

	public Pedido searchByKeyPedido(Integer chave) {
		return pedidoRN.searchByKey(chave);
	}

	public void insertPedido(Pedido pedido) {
		pedidoRN.insert(pedido);
	}

	public Pedido updatePedido(Pedido pedido) {
		return pedidoRN.update(pedido);
	}

	public void removePedido(Pedido pedido) {
		pedidoRN.remove(pedido);
	}

	// Ações Pessoa
	public List<Pessoa> getAllPessoa() {
		return pessoaRN.getAll();
	}

	public Pessoa searchByKeyPessoa(Integer chave) {
		return pessoaRN.searchByKey(chave);
	}

	public void insertPessoa(Pessoa pessoa) {
		pessoaRN.insert(pessoa);
	}

	public Pessoa updatePessoa(Pessoa pessoa) {
		return pessoaRN.update(pessoa);
	}

	public void removePessoa(Pessoa pessoa) {
		pessoaRN.remove(pessoa);
	}

	// Ações Produto
	public List<Produto> getAllProduto() {
		return produtoRN.getAll();
	}

	public Produto searchByKeyProduto(Integer chave) {
		return produtoRN.searchByKey(chave);
	}

	public void insertProduto(Produto produto) {
		produtoRN.insert(produto);
	}

	public Produto updateProduto(Produto produto) {
		return produtoRN.update(produto);
	}

	public void removeProduto(Produto produto) {
		produtoRN.remove(produto);
	}

	// Ações Químico
	public List<Quimico> getAllQuimico() {
		return quimicoRN.getAll();
	}

	public Quimico searchByKeyQuimico(Integer chave) {
		return quimicoRN.searchByKey(chave);
	}

	public void insertQuimico(Quimico quimico) {
		quimicoRN.insert(quimico);
	}

	public Quimico updateQuimico(Quimico quimico) {
		return quimicoRN.update(quimico);
	}

	public void removeQuimico(Quimico quimico) {
		quimicoRN.remove(quimico);
	}
}
