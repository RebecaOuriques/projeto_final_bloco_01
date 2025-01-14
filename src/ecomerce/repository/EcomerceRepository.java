package ecomerce.repository;

import ecomerce.model.Produto;

public interface EcomerceRepository{
	
	//CRUD
	public void procurarPorNumero( int numero);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int numero);
	
	
	public void vender(int numero, float valor);
	public void devolver(int numero, float valor);
	
}
