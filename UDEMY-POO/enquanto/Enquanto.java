package enquanto;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {

		Scanner lerTeclado = new Scanner(System.in);

		int x = lerTeclado.nextInt();
		int soma = 0;
		
		while (x != 0) {
			x = lerTeclado.nextInt();
			soma += x;
		}

		System.out.println(soma);

		lerTeclado.close();

	}

}
