package cursojava;

public class Ex006 {

	public static void main(String[] args) {
		

		int ccont = 0;
		int x = 10;
		System.out.println("Esse é o valor inicial de 'X' " + x);

		do {
			ccont++;
			x++;
			System.out.println(x);
		} while (ccont < 20);
	}

}
