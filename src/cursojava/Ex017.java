package cursojava;

import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
			
		double h, b, B, area;
		
		System.out.println("Digite a altura do trapézio: ");
		h = in.nextDouble();
		System.out.println("Digite a base menor do trapézio: ");
		b = in.nextDouble();
		System.out.println("Digite a base maior do trapáezio: ");
		B = in.nextDouble();
		area = ((b+B)*h)/2;
		System.out.println("A área do trapézio é de: "+area);
		
	}

}
