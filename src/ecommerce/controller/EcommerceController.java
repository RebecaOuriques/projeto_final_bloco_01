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
		var produto = buscarNaCollection(numero);
		if (produto != null) {
			if(produtoLista.remove(produto) == true)
		System.out.println("\nProduto número " + numero + " removido");
	} else {
		System.out.println("\nProduto número " + numero + " não foi encontrado!");
	} 
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
	
	public Produto buscarNaCollection (int numero){
		for (var produto : produtoLista) {
			if(produto.getNumero() == numero) {
				return produto;
			}
		}
		return null;
	}
}
