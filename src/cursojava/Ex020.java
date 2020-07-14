package cursojava;

public class Ex020 {

	public static void main(String[] args) {

		for (int loop = 1; loop < 10; ++loop) { /*
													 * aqui eu incremento a variável loop de 2 em 2 para que o numero de
													 * '*' seja impresso em quantidade impar como é pedido no exercício*/
													 

			for (int coluna = 0; coluna < loop; coluna++) {
				System.out.print("*"); // aqui usei o print para que o resultado fosse impresso na mesma linha
			}
			System.out.println("");// esse comando insere uma linha a mais no final de cada laço
		}

		

	}
}
