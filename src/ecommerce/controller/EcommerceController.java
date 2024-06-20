package ecommerce.controller;

import java.util.ArrayList;

import ecomerce.model.Produto;
import ecomerce.repository.EcomerceRepository;

public class EcommerceController implements EcomerceRepository{
	public int numero;
	ArrayList<Produto> produtoLista = new ArrayList<Produto>();
	
	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarTodos() {
		for (var produto : produtoLista)
			produto.visualizar();	
	}

	@Override
	public void cadastrar(Produto produto) {
		produtoLista.add(produto);
		System.out.println("Produto cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Produto produto) {
		
	}

	@Override
	public void deletar(int numero) {
		produtoLista.remove(numero);
		int numero2 = numero + 1;
		System.out.println("Produto " + numero2 + " removido");
	}

	@Override
	public void vender(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void devolver(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero() {
		return ++numero;
	}

}
