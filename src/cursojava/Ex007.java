package cursojava;

public class Ex007 {

	public static void main(String[] args) {

		System.out.println("Esta aplicação irá realizar a soma dos números impares e a multiplicação"
				+ "\ndos números pares dos números contidos no intervalo entre 1 e 30 \n");

		int soma = 0;
		long mult = 1;
		for (int i = 1; i < 30; i += 2) { /*
											 * Aqui estou iniciando a variável "i" com o valor 1 e dizendo que o laço
											 * deve ocorrer até "i" menor que 30 e na ultima condição determino o valor
											 * do passo ou seja de 2 em 2
											 */
			soma += i; // aqui o valor de "i" já inicia em impar pois atribuí o valor 1 inicial.
			mult *= (i + 1);/*
							 * aqui eu adciono 1 ao valor de "i" que inicialmente é impar tornando ela uma
							 * variável com valor par e realizando a multiplicação.
							 */

		}
		System.out.println("O resultado da soma dos números impares no intervalo é: " + soma);
		System.out.println("\nO resultado da multiplicação dos números pares no intervalo é: " + mult);
	}

}
