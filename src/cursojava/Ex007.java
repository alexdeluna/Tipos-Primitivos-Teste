package cursojava;

public class Ex007 {

	public static void main(String[] args) {

		System.out.println("Esta aplica��o ir� realizar a soma dos n�meros impares e a multiplica��o"
				+ "\ndos n�meros pares dos n�meros contidos no intervalo entre 1 e 30 \n");

		int soma = 0;
		long mult = 1;
		for (int i = 1; i < 30; i += 2) { /*
											 * Aqui estou iniciando a vari�vel "i" com o valor 1 e dizendo que o la�o
											 * deve ocorrer at� "i" menor que 30 e na ultima condi��o determino o valor
											 * do passo ou seja de 2 em 2
											 */
			soma += i; // aqui o valor de "i" j� inicia em impar pois atribu� o valor 1 inicial.
			mult *= (i + 1);/*
							 * aqui eu adciono 1 ao valor de "i" que inicialmente � impar tornando ela uma
							 * vari�vel com valor par e realizando a multiplica��o.
							 */

		}
		System.out.println("O resultado da soma dos n�meros impares no intervalo �: " + soma);
		System.out.println("\nO resultado da multiplica��o dos n�meros pares no intervalo �: " + mult);
	}

}
