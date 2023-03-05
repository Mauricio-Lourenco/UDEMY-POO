package arrayMatrizes;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int n;
		double soma, media;

		System.out.println("Digite o tamanho do vetor: ");
		n = lerTeclado.nextInt();

		double vetor[] = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Insira o valor: ");
			vetor[i] = lerTeclado.nextDouble();
		}

		soma = 0;

		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}

		media = soma / n;

		for (int i = 0; i < n; i++) {
			System.out.printf("Valores: %.1f\n", vetor[i]);
		}

		System.out.printf("Soma: %.2f\n", soma);
		System.out.printf("Média: %.2f\n", media);

		lerTeclado.close();

	}

}
