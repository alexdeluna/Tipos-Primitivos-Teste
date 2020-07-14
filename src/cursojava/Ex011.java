package cursojava;

import java.util.Scanner;

public class Ex011 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int dias, mes = 22;
		float salario, proporcional;
		
		System.out.println("Digite o salário integral do funcionário: \n");
		salario =in.nextFloat();
		System.out.println("Digite o número de dias trabalhados pelo funcionário: \n");
		dias = in.nextInt();
		proporcional = (salario / mes) * dias;
		System.out.println("O funcionário deve receber R$ "+ proporcional+" Pelos "+dias+" dias trabalhados.");
		
	}

}
