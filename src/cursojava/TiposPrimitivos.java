package cursojava;

import java.util.Scanner;

public class TiposPrimitivos {

		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
		int num1 , num2;
		double res;
		String nome;
		System.out.println("Este programa vai ler o nome do usário e dois numeros inteiros\ne realizar a divisão entre os números retornando o\nnome do usuário e o resultado da divisão!");
		System.out.println("Digite seu nome! ");
		nome = in.next();
		System.out.println("Digite o primeiro número! ");
		num1 = in.nextInt();
		System.out.println("Digite o segundo número! ");
		num2 = in.nextInt();
		res = num1 / num2;
		System.out.println("Seu nome "+nome+" A divisão entre "+num1+" "+num2+" é "+res );
		System.out.println("O valor digitado para uma variável do tipo String foi "+nome);
		System.out.println("O valor digitado para as variáveis do tipo 'int' foram "+num1+"e "+num2);
		System.out.println("O valor atribuído a variável do tipo float foi "+ res);
		
	}

}