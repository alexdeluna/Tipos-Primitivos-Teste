package cursojava;

import java.util.Scanner;

public class Ex004 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int dia = 1;

		while (dia != 0) {

			System.out.println("Digite [1] DOMINGO");
			System.out.println("Digite [2] SEGUNDA");
			System.out.println("Digite [3] TER�A");
			System.out.println("Digite [4] QUARTA");
			System.out.println("Digite [5] QUINTA");
			System.out.println("Digite [6] SEXTA");
			System.out.println("Digite [7] S�BADO");
			System.out.println("Digite o n�mero corespondente ao dia desejado: ");
			System.out.println("DIGITE 0 (ZERO) PARA SAIR");
			dia = in.nextInt();

			if (dia == 1) {
				System.out.println("O dia escolhido foi: ''DOMINGO'' ");
			}
			if (dia == 2) {
				System.out.println("O dia escolhido foi: ''SEGUNDA'' ");
			}
			if (dia == 3) {
				System.out.println("O dia escolhido foi: ''TER�A'' ");
			}
			if (dia == 4) {
				System.out.println("O dia escolhido foi: ''QUARTA'' ");
			}
			if (dia == 5) {
				System.out.println("O dia escolhido foi: ''QUINTA'' ");
			}
			if (dia == 6) {
				System.out.println("O dia escolhido foi: ''SEXTA'' ");
			}
			if (dia == 7) {
				System.out.println("O dia escolhido foi: ''S�BADO'' ");
			}
			if (dia < 0 || dia > 7) {
				System.out.println("Op��o inv�lida, Tente novamente");
			}
			if (dia == 0) {
				System.out.println("FIM DA EXECU��O");
			}
		} // while
	}// main

} // AQUI FECHA A CLASSE
