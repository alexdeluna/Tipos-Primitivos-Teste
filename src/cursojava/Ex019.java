package cursojava;

public class Ex019 {

	public static void main(String[] args) {

		int quadrado = 0;
		int cont = 0;
		for (int i = 15; i < 35; i += 2) {

			if (i % 2 != 0) {
				quadrado = i * i;
				cont = i;
				System.out.println("O valor de " + cont + " elevado ao quadrado é " + quadrado);
			}
		}
	}

}
