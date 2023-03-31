package listaCompras.util;

import java.text.NumberFormat;
import java.util.List;
import java.util.Scanner;
import listaCompras.util.Cores;
import listaCompras.produto;

public class funcoesMenu {

	public static void mostrarMenu() {

		System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
	    System.out.println(
				"                                                                                                                               ");
		System.out.println(
				"                  ╓═════════════════════════════════════════════════════════════════════════════════════════╖                  ");
		System.out.println(
				"                  ║                                                                                         ║                  ");
		System.out.println(
				"                  ║                                                                                         ║                  ");
		System.out.println("                  ║   ██╗     ██╗███████╗████████╗    ███╗   ███╗ █████╗ ███████╗████████╗███████╗██████╗   ║                  ");
	    System.out.println("                  ║   ██║     ██║██╔════╝╚══██╔══╝    ████╗ ████║██╔══██╗██╔════╝╚══██╔══╝██╔════╝██╔══██╗  ║                  ");
	    System.out.println("                  ║   ██║     ██║███████╗   ██║       ██╔████╔██║███████║███████╗   ██║   █████╗  ██████╔╝  ║                  ");
	    System.out.println("                  ║   ██║     ██║╚════██║   ██║       ██║╚██╔╝██║██╔══██║╚════██║   ██║   ██╔══╝  ██╔══██╗  ║                  ");
	    System.out.println("                  ║   ███████╗██║███████║   ██║       ██║ ╚═╝ ██║██║  ██║███████║   ██║   ███████╗██║  ██║  ║                  ");
	    System.out.println("                  ║   ╚══════╝╚═╝╚══════╝   ╚═╝       ╚═╝     ╚═╝╚═╝  ╚═╝╚══════╝   ╚═╝   ╚══════╝╚═╝  ╚═╝  ║                  ");
	    System.out.println("                  ║                                                                                         ║                  ");
		System.out.println(
				"                  ║                                                                                         ║                  ");
		System.out.println(
				"                  ║                                                                                         ║                  ");
		System.out.println(
				"                  ║                                                                                         ║                  ");
		System.out.println(
				"                  ║            SELECIONE UMA OPÇÃO                                                          ║                  ");
		System.out.println(
				"                  ║                                                                                         ║                  ");
		System.out.println(
				"                  ╟══════════════════╤══════════════════════════════════════════════════════════════════════╢                  ");
		System.out.println(
				"                  ║                  ║                                                                      ║                  ");
		System.out.println(
				"                  ║         1        ║           +         ADICIONAR ITEM A LISTA DE COMPRAS                ║                  ");
		System.out.println(
				"                  ║                  ║                                                                      ║                  ");
		System.out.println(
				"                  ╟══════════════════╬══════════════════════════════════════════════════════════════════════╢                  ");
		System.out.println(
				"                  ║                  ║                                                                      ║                  ");
		System.out.println(								
				"                  ║         2        ║           -         REMOVER ITENS DA LISTA DE COMPRAS                ║                  ");
		System.out.println(
				"                  ║                  ║                                                                      ║                  ");
		System.out.println(
				"                  ╟══════════════════╬══════════════════════════════════════════════════════════════════════╢                  ");
		System.out.println(
				"                  ║                  ║                                                                      ║                  ");
		System.out.println(								
				"                  ║         3        ║           @         ATUALIZAR ITENS DA LISTA DE COMPRAS              ║                  ");
		System.out.println(
				"                  ║                  ║                                                                      ║                  ");
		System.out.println(
				"                  ╟══════════════════╬══════════════════════════════════════════════════════════════════════╢                  ");
		System.out.println(
				"                  ║                  ║                                                                      ║                  ");
		System.out.println(
				"                  ║         4        ║           #         CARREGAR LISTA DE COMPRAS                        ║                  ");
		System.out.println(
				"                  ║                  ║                                                                      ║                  ");
		System.out.println( 
				"                  ╙══════════════════╨══════════════════════════════════════════════════════════════════════╜                  ");
		System.out.println(
				"                                                                                                                               ");

	}

	public static produto cadastraProduto() {
		Scanner read = new Scanner(System.in);
		System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
		produto ProdutoTest = new produto(null, 0, null, null, 0, null);
		System.out.println(
				"                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
		System.out.println(
				"                 ║                                  Digite o Nome:                                          ║                   ");
		System.out.println(
				"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   ");
		String nome = read.nextLine();
		ProdutoTest.setNome(nome);
		System.out.println(
				"                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
		System.out.println(
				"                 ║                                  Digite a Categoria:                                     ║                   ");
		System.out.println(
				"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   ");
		String categoria = read.nextLine();
		ProdutoTest.setCategoria(categoria);
		System.out.println(
				"                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
		System.out.println(
				"                 ║                                  Digite a Quantidade:                                    ║                   ");
		System.out.println(
				"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   ");
		int quantidade = read.nextInt();
		read.nextLine();
		ProdutoTest.setQuantidade(quantidade);
		System.out.println(
				"                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
		System.out.println(
				"                 ║                                  Digite a Marca:                                         ║                   ");
		System.out.println(
				"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   ");
		String marca = read.nextLine();
		ProdutoTest.setMarca(marca);

		System.out.println(
				"                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
		System.out.println(
				"                 ║                                 Digite o Preço Unitário:                                 ║                   ");
		System.out.println(
				"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   ");
		double preco = read.nextDouble();
		read.nextLine();
		ProdutoTest.setPreco(preco);
		System.out.println(
				"                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
		System.out.println(
				"                 ║                                 Digite o Código:                                         ║                   ");
		System.out.println(
				"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   ");
		String codigo = read.nextLine();
		ProdutoTest.setCodBarras(codigo);

		System.out.println(
				"                                                                                                                                ");
		System.out.println(
				"                  ╓══════════════════════════════════════════════════════════════════════════════════════════╖                  ");
		System.out.println(
				"                  ║                               Produto Cadastrado com sucesso!                            ║                  ");
		System.out.println(
				"                  ╙══════════════════════════════════════════════════════════════════════════════════════════╜                  ");
		System.out.println(
				"                                                                                                                                ");
		return ProdutoTest;
	}

	public static void carregaLista(List<produto> listaItens) {
		for (int i = 0; i < listaItens.size(); i++) {
			System.out.println("\nItem: " + (i + 1));
			System.out.println(listaItens.get(i).toString());
			System.out.println("\n" + "-".repeat(125));
		}
	}

	public static boolean verificaLista(List<produto> listaItens) {
		if (listaItens.isEmpty() == true) {
			System.out.println();
			System.out.println(Cores.TEXT_RED_BOLD+
					"                  ╓══════════════════════════════════════════════════════════════════════════════════════════╖                  ");
			System.out.println(
					"                  ║                                   A LISTA ESTA VAZIA        ¯\\('U')//¯                   ║                  ");
			System.out.println(
					"                  ╙══════════════════════════════════════════════════════════════════════════════════════════╜                  "+Cores.TEXT_RESET);
			return true;
		} else {
			return false;
		}
	}

	public static void excluiItem(List<produto> listaItens, String nomeExcluir) {

		for (int i = 0; i < listaItens.size(); i++) {

			if (listaItens.get(i).getNome().equals(nomeExcluir)) {
				listaItens.remove(i);
				// System.out.println(listaItens);
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND+
						"                                                                                                                                ");
				System.out.println(
						"                  ╓══════════════════════════════════════════════════════════════════════════════════════════╖                  ");
				System.out.println(
						"                  ║                                  Produto removido com sucesso !!!                        ║                  ");
				System.out.println(
						"                  ╙══════════════════════════════════════════════════════════════════════════════════════════╜                  ");
				System.out.println( 
						"                                                                                                                                "+Cores.TEXT_RESET);
				return;
			}
		}
	}

	public static void atualizarItem(List<produto> listaItens, String nome1) {
		Scanner read = new Scanner(System.in);

		for (int i = 0; i < listaItens.size(); i++) {
			if (listaItens.get(i).getNome().contains(nome1)) {
				listaItens.remove(i);
				System.out.println(
						"                                                                                             ");
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT+
						"                  ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
				System.out.println(
						"                  ║                                Insira os dados do novo Produto:                          ║                   ");
				System.out.println(
						"                  ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   "+Cores.TEXT_RESET);
				System.out.println(
						"                                                                                             ");
				produto atualizaProduto = cadastraProduto();
				listaItens.add(atualizaProduto);
			    read.nextLine();
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT+
						"                  ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
				System.out.println( 
						"                  ║                                    LISTA ATUALIZADA !                                    ║                   ");
				System.out.println(
						"                  ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   "+Cores.TEXT_RESET);
				System.out.println(
						"                                                                                             ");
				System.out.println(
						"                                                                                             ");
				System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT+
						"                  ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
				System.out.println(
						"                  ║                                   Produtos do estoque :                                  ║                   ");
				System.out.println(
						"                  ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   "+Cores.TEXT_RESET);
				System.out.println(
						"                                                                                             ");
				carregaLista(listaItens);
				return;
			} else {
				System.out.println(Cores.TEXT_RED_BOLD+
						"                                                                                                                                ");
				System.out.println(
						"                  ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
				System.out.println(
						"                  ║                                  Esse Produto não Existe!                                ║                   ");
				System.out.println(
						"                  ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   ");
				System.out.println(
						"                                                                                                                                 "+Cores.TEXT_RESET);
			}
			break;
		}

	}

	public static int quantidadeDeItems(List<produto> listaItens) {
		int somaQuat = 0;
		for (int x = 0; x < listaItens.size(); x++) {
			int Quant = listaItens.get(x).getQuantidade();
			somaQuat+=Quant;
		}
		return somaQuat;
	}

	public static double calculaItem(List<produto> listaItens) {
		double somaPreco = 0;
		for (int i = 0; i < listaItens.size(); i++) {
			double precoItem = listaItens.get(i).getPreco();
			int Qtd = listaItens.get(i).getQuantidade();
			somaPreco += precoItem * Qtd;

		}

		return (somaPreco);
	}

	public static String formatarMoeda(double valor) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		return nf.format(valor);
	}
}
