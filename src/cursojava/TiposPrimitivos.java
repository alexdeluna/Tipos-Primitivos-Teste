package cursojava;

import java.util.Scanner;

public class TiposPrimitivos {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		int num1 , num2;
		double res;
		String nome;
		System.out.println("Este programa vai ler o nome do us�rio e dois numeros inteiros\ne realizar a divis�o entre os n�meros retornando o\nnome do usu�rio e o resultado da divis�o!");
		System.out.println("Digite seu nome! ");
		nome = in.next();
		System.out.println("Digite o primeiro n�mero! ");
		num1 = in.nextInt();
		System.out.println("Digite o segundo n�mero! ");
		num2 = in.nextInt();
		res = num1 / num2;
		System.out.println("Seu nome "+nome+" A divis�o entre "+num1+" "+num2+" � "+res );
		System.out.println("O valor digitado para uma vari�vel do tipo String foi "+nome);
		System.out.println("O valor digitado para as vari�veis do tipo 'int' foram "+num1+"e "+num2);
		System.out.println("O valor atribu�do a vari�vel do tipo float foi "+ res);
		
	}

}