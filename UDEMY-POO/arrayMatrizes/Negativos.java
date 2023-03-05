package arrayMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Scanner lerTeclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Digite o tamanho do Vetor: ");
		int n = lerTeclado.nextInt();

		int produto[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Digite " + n + " números inteiros");
			produto[i] = lerTeclado.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (produto[i] < 0) {
				System.out.printf("Negativos: %d", produto[i]);
			}
		}

		lerTeclado.close();

	}

}
