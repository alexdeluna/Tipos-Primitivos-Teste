package cursojava;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int dias, mes = 22;
		float salario, proporcional;
		
		System.out.println("Digite o sal�rio integral do funcion�rio: \n");
		salario =in.nextFloat();
		System.out.println("Digite o n�mero de dias trabalhados pelo funcion�rio: \n");
		dias = in.nextInt();
		proporcional = (salario / mes) * dias;
		System.out.println("O funcion�rio deve receber R$ "+ proporcional+" Pelos "+dias+" dias trabalhados.");
		
	}

}
