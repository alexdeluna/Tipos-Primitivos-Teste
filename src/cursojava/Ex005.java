package cursojava;

import java.util.Scanner;

public class Ex005 {

	/*
	 * IMPLEMENTE UM PROGRAMA QUE RECEBE REPETIDAMENTE UM NÚMERO DE 1 A 12, ENQUANTO
	 * ESSE NÚMERO FOR DIFERENTE DE 0 (ZERO), E IMPRIME O MÊS CORRESPONDENTE. QUANDO
	 * O NÚMERO ESTIVER FORA DO INTERVALO PERMITIDO, A MENSAGEM "MÊS INVÁLIDO"
	 * DEVERÁ SER EXIBIDA
	 */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int resposta = 1;

		while (resposta == 1) {

			int opcao;

			System.out.println(
					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("Digite um valor correspondente ao mês desejado\n" + "[1] - JANEIRO\n"
					+ "[2] - FEVEREIRO\n" + "[3] - MARÇO\n" + "[4] - ABRIL\n" + "[5] - MAIO\n" + "[6] - JUNHO\n"
					+ "[7] - JULHO\n" + "[8] - AGOSTO\n" + "[9] - SETEMBRO\n" + "[10] - OUTUBRO\n" + "[11] - NOVEMBRO\n"
					+ "[12] - DEZEMBRO");
			System.out.println("\nDIGITE 0 (ZERO) PARA SAIR. ");
			System.out.println(
					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			opcao = in.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("JANEIRO'.");
				break;
			case 2:
				System.out.println("FEVEREIRO'.");
				break;
			case 3:
				System.out.println("'MARÇO'.");
				break;
			case 4:
				System.out.println("'ABRIL'.");
				break;
			case 5:
				System.out.println("'MAIO.");
				break;
			case 6:
				System.out.println("'JUNHO'.");
				break;
			case 7:
				System.out.println("'JULHO'.");
				break;
			case 8:
				System.out.println("'AGOSTO'.");
				break;
			case 9:
				System.out.println("'SETEMBRO'.");
				break;
			case 10:
				System.out.println("'OUTUBRO'.");
				break;
			case 11:
				System.out.println("'NOVEMBRO'.");
				break;
			case 12:
				System.out.println("'DEZEMBRO'.");
				break;
			default:
				if (opcao < 0 || opcao > 12) {
					System.out.println("MÊS INVÁLIDO, TENTE NOVAMENTE.");
				}

			}// aqui fecha o switch

			if (opcao == 0) {
				System.out.println("Você decidiu sair da aplicação.");
				resposta = 0;
			} // Aqui fecha o IF

		} // aqui fecha o while

	} // aqui fecha o Main
} // AQUI FECHA A CLASSE
