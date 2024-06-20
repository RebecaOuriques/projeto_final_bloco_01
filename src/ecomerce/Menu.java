package ecomerce;

import java.io.IOException;
import java.util.Scanner;

import ecomerce.model.Livro;
import ecomerce.model.Revista;
import ecommerce.controller.EcommerceController;

public class Menu {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		EcommerceController itens = new EcommerceController();

		int opcao, tipo, pagina, numero;
		float valor;
		String produto, genero, tema;

		Livro l1 = new Livro(itens.gerarNumero(), 1, "Amor", 100, 100.0f, "Aventura");
		itens.cadastrar(l1);
		Livro l2 = new Livro(itens.gerarNumero(), 1, "Vida", 200, 150.0f, "Romance");
		itens.cadastrar(l2);
		Revista r1 = new Revista(itens.gerarNumero(), 2, "Out", 50, 35.0f, "Cultura");
		itens.cadastrar(r1);
		Revista r2 = new Revista(itens.gerarNumero(), 2, "Style", 30, 15.0f, "Moda");
		itens.cadastrar(r2);

		System.out.println("\n*********************************************");
		System.out.println("     Bem-vinde a Livraria Floreios e Borrões   ");
		System.out.println("\n*********************************************");
		System.out.println("           1 - Cadastrar um novo produto       ");
		System.out.println("           2 - Listar os produtos              ");
		System.out.println("           3 - Consultar o produto por número  ");
		System.out.println("           4 - Atualizar um produto            ");
		System.out.println("           5 - Deletar um produto              ");
		System.out.println("           6 - Vender produto                  ");
		System.out.println("           7 - Sair do programa                ");
		System.out.println("\n*********************************************");

		do {
			System.out.print("\nDigite a opção desejada: ");
			opcao = leia.nextInt();
			System.out.println("*********************************************");

			switch (opcao) {

			case 1:
				System.out.println("Informe o tipo de produto que deseja cadastrar: \n1- Livros / 2- Revista");

				tipo = leia.nextInt();

				if (tipo >= 1 && tipo <= 2) {
					if (tipo == 1) {

						System.out.println("Informe o titulo do livro que deseja cadastrar:");
						leia.skip("\\R?");
						produto = leia.nextLine();
						System.out.println("Informe o gênero do livro que deseja cadastrar:");
						leia.skip("\\R?");
						genero = leia.nextLine();
						System.out.println("Informe a quantidade de páginas do livro que deseja cadastrar:");
						pagina = leia.nextInt();
						System.out.println("Informe o valor do livro que deseja cadastrar:");
						valor = leia.nextFloat();
						System.out.println("\n");

						itens.cadastrar(new Livro(itens.gerarNumero(), tipo, produto, pagina, valor, genero));

					} else if (tipo == 2) {
						System.out.println("Informe o titulo da revista que deseja cadastrar:");
						leia.skip("\\R?");
						produto = leia.nextLine();
						System.out.println("Informe o tema da revista que deseja cadastrar:");
						leia.skip("\\R?");
						tema = leia.nextLine();
						System.out.println("Informe a quantidade de páginas da revista que deseja cadastrar:");
						pagina = leia.nextInt();
						System.out.println("Informe o valor da revista que deseja cadastrar:");
						valor = leia.nextFloat();
						System.out.println("\n");
						itens.cadastrar(new Revista(itens.gerarNumero(), tipo, produto, pagina, valor, tema));
					}
				} else {
					System.out.println("Opção inválida, escolha a opção 1 ou 2!");
				}

				keyPress();
				break;

			case 2:
				System.out.println("Seguem os produtos contidos na lista:");
				itens.listarTodos();
				keyPress();
				break;

			case 3:
				System.out.println("Informe o número do produto que deseja consultar:");
				numero = leia.nextInt();
				itens.procurarPorNumero(numero);

				keyPress();
				break;

			case 4:
				System.out.println("Informe o núemro do produto que deseja atualizar:");
				numero = leia.nextInt();
				var buscarProduto = itens.buscarNaCollection(numero);
				tipo = buscarProduto.getTipo();

				if (buscarProduto != null)

					if (tipo >= 1 && tipo <= 2) {
						if (tipo == 1) {

							System.out.println("Informe o titulo do livro que deseja atualizar:");
							leia.skip("\\R?");
							produto = leia.nextLine();
							System.out.println("Informe o gênero do livro que deseja atualizar:");
							leia.skip("\\R?");
							genero = leia.nextLine();
							System.out.println("Informe a quantidade de páginas do livro que deseja atualizar:");
							pagina = leia.nextInt();
							System.out.println("Informe o valor do livro que deseja atualizar:");
							valor = leia.nextFloat();
							System.out.println("\n");

							itens.cadastrar(new Livro(itens.gerarNumero(), tipo, produto, pagina, valor, genero));

						} else if (tipo == 2) {
							System.out.println("Informe o titulo da revista que deseja atualizar:");
							leia.skip("\\R?");
							produto = leia.nextLine();
							System.out.println("Informe o tema da revista que deseja atualizar:");
							leia.skip("\\R?");
							tema = leia.nextLine();
							System.out.println("Informe a quantidade de páginas da revista que deseja atualizar:");
							pagina = leia.nextInt();
							System.out.println("Informe o valor da revista que deseja atualizar:");
							valor = leia.nextFloat();
							System.out.println("\n");
							itens.cadastrar(new Revista(itens.gerarNumero(), tipo, produto, pagina, valor, tema));
						}
					} else {
						System.out.println("Opção inválida, escolha a opção 1 ou 2!");
					}

				keyPress();
				break;

			case 5:
				System.out.println("Informe qual produto deseja deletar:?");
				numero = leia.nextInt();
				itens.deletar(numero);
				keyPress();
				break;

			case 6:
				System.out.println("Informe qual produto deseja vender:?");
				numero = leia.nextInt();
				itens.vender(numero);

				keyPress();
				break;

			case 7:
				System.out.println("Obrigada utilizar nosso programa! \nVolte sempre!");

				keyPress();
				break;

			default:
				System.out.println("Opção inválida! \nInforme um número entre 1 e 5, conforme menu!");
				keyPress();
				break;

			}

		} while (opcao != 7);

		leia.close();

	}

	public static void keyPress() {
		try {
			System.out.println("\nPressione  Enter para Continuar... ");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}
}
