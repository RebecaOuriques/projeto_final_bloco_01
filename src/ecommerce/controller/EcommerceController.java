package ecommerce.controller;

import java.util.ArrayList;

import ecomerce.model.Produto;
import ecomerce.repository.EcomerceRepository;

public class EcommerceController implements EcomerceRepository{
	public int numero;
	ArrayList<Produto> produtoLista = new ArrayList<Produto>();
	
	@Override
	public void procurarPorNumero(int numero) {
		var produto = buscarNaCollection(numero);
		if (produto != null) {
			produto.visualizar();
		} else 
			System.out.println("\nO produto número " + numero + "não foi encontrado!");
		
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
		var buscarProduto = buscarNaCollection(produto.getNumero());
		if(buscarProduto != null) {
			produtoLista.set(produtoLista.indexOf(buscarProduto), produto);
			System.out.println("\nO produto número: " + produto.getNumero() + "foi atualizado com sucesso!");
		} else
			System.out.println("\nA Conta número: " + produto.getNumero() + "não foi encontrada!");
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
	public void vender(int numero) {
		var produto = buscarNaCollection(numero);
		if (produto != null) {
			if(produtoLista.remove(produto) == true)
		System.out.println("\nProduto número " + numero + " foi vendido, no valor de R$: " + produto.getValor());
	} else {
		System.out.println("\nProduto número " + numero + " não foi encontrado!");
	} 
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
