package listaCompras;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import listaCompras.util.*;
import listaCompras.util.Cores;

public class menuPrincipal {

	public static void main(String[] args) {

		int opcao = 0;

		funcoesMenu menu = new funcoesMenu();
		Scanner read = new Scanner(System.in);

		List<produto> listaItens = new ArrayList<produto>();

		while (true) {

			while (true) {

				try {
					menu.mostrarMenu();
					opcao = read.nextInt();
					break;

				} catch (InputMismatchException inputMismatchException) {

					System.err.println(inputMismatchException);
					System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_BLACK_BACKGROUND
							+ "                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                 ");
					System.out.println(
							"                 ║                            DiGITE UM NUMERO VALIDO :                                     ║                 ");
					System.out.println(
							"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                 "
									+ Cores.TEXT_RESET);
					keyPress();
				}
			}
			switch (opcao) {
			case 1:
				produto novoProduto = menu.cadastraProduto();
				listaItens.add(novoProduto);
				keyPress();
				break;

			case 2:
				if (funcoesMenu.verificaLista(listaItens) == true) {
					keyPress();
					break;

				} else {
					read.nextLine();
					System.out.println(
							"                  ╓══════════════════════════════════════════════════════════════════════════════════════════╖                 ");
					System.out.println(
							"                  ║                          Digite o nome do item que deseja excluir:                       ║                 ");
					System.out.println(
							"                  ╙══════════════════════════════════════════════════════════════════════════════════════════╜                 ");
					String nomeExcluir = read.nextLine();
					funcoesMenu.excluiItem(listaItens, nomeExcluir);
					keyPress();
					break;
				}
			case 3:
				if (funcoesMenu.verificaLista(listaItens) == true) {
					keyPress();
					break;

				} else {
					read.nextLine();
					System.out.println(
							"                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                  ");
					System.out.println(
							"                 ║                          Digite o nome do produto que dejesa atualizar:                  ║                  ");
					System.out.println(
							"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                  "
									+ Cores.TEXT_RESET);
					String atualiza = read.nextLine();
					funcoesMenu.atualizarItem(listaItens, atualiza);
					keyPress();
					break;
				}
			case 4:
				if (funcoesMenu.verificaLista(listaItens)) {
					keyPress();
					break;

				} else {
					read.nextLine();
					funcoesMenu.carregaLista(listaItens);
					System.out.println(
							"                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
					System.out.println("                 ║                O Numero de itens na lista: "
							+ funcoesMenu.quantidadeDeItems(listaItens)
							+ "                                            ║                   ");
					System.out.println(
							"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   ");
					read.nextLine();
					System.out.println(
							"                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                   ");
					System.out.println("                 ║                Valor total da Lista: R$ "
							+ funcoesMenu.calculaItem(listaItens)
							+ "                                           ║                 ");
					System.out.println(
							"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                   ");
					keyPress();
					break;
				}

			default:

				System.out.println(Cores.TEXT_RED_BOLD + Cores.ANSI_BLACK_BACKGROUND
						+ "                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                 ");
				System.out.println(
						"                 ║                            DiGITE UM NUMERO VALIDO :                                     ║                 ");
				System.out.println(
						"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                 "
								+ Cores.TEXT_RESET);
				read.nextLine();
				keyPress();
			}

		}
	}

	public static void keyPress() {

		try {
			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT 
					+ "                  ╓══════════════════════════════════════════════════════════════════════════════════════════╖                  ");
			System.out.println(
					"                  ║                               Pressione Enter para Continuar...                          ║                  ");
			System.out.println(
					"                  ╙══════════════════════════════════════════════════════════════════════════════════════════╜                  "
							+ Cores.TEXT_RESET);
			System.in.read();

		} catch (IOException e) {
			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT 
				
					+ "                 ╓══════════════════════════════════════════════════════════════════════════════════════════╖                 ");
			System.out.println(
					"                 ║                          Você pressionou uma tecla diferente de enter!                   ║                 ");
			System.out.println(
					"                 ╙══════════════════════════════════════════════════════════════════════════════════════════╜                 "
							+ Cores.TEXT_RESET);

		}
	}
}
