package arrayMatrizes;

import java.util.Scanner;

public class Altura {

	public static void main(String[] args) {

		Scanner lerTeclado = new Scanner(System.in);

		System.out.println("Quantas pessoas serão analizadas?");
		int n = lerTeclado.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		int contagem = 0;
		double soma = 0.0, media = soma / n, percentual = contagem * 100.0 / n;

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.println("Nome: ");
			nomes[i] = lerTeclado.next();
			System.out.println("Idade: ");
			idades[i] = lerTeclado.nextInt();
			System.out.println("Altura: ");
			alturas[i] = lerTeclado.nextDouble();
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			soma = soma + alturas[i];
		}

		System.out.println();
		System.out.printf("Média das alturas:           %.2f", media);

		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				contagem = contagem + 1;
			}
		}

		System.out.printf("\nPercentual de menores de 16: %.2f%%\n ", percentual);

		lerTeclado.close();
	}
}