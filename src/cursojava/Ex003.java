package cursojava;

import java.util.Scanner;

public class Ex003 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int dia;

		System.out.println("Digite [1] DOMINGO");
		System.out.println("Digite [2] SEGUNDA");
		System.out.println("Digite [3] TERÇA");
		System.out.println("Digite [4] QUARTA");
		System.out.println("Digite [5] QUINTA");
		System.out.println("Digite [6] SEXTA");
		System.out.println("Digite [7] SÁBADO");
		System.out.println("");
		System.out.println("Digite o número corespondente ao dia desejado: ");
		dia = in.nextInt();

		if (dia == 1) {
			System.out.println("O dia escolhido foi: ''DOMINGO'' ");
		}
		if (dia == 2) {
			System.out.println("O dia escolhido foi: ''SEGUNDA'' ");
		}
		if (dia == 3) {
			System.out.println("O dia escolhido foi: ''TERÇA'' ");
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
			System.out.println("O dia escolhido foi: ''SÁBADO'' ");
		}

	}

}