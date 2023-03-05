package arrayMatrizes;

import java.util.Scanner;

public class AppPensionato {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		
		Pensionato[] vetor = new Pensionato[10];

		System.out.println("Quantos quartos deseja Alugar?");
		int n = lerTeclado.nextInt();

		for (int i = 1; i <=n; i++) {
			System.out.println("Quarto: " + i + "\n");
			System.out.println("Nome: ");
			String nome = lerTeclado.next();
			System.out.println("Email: ");
			String email = lerTeclado.next();
			System.out.println("Quarto desejado: ");
			int NumeroQuarto = lerTeclado.nextInt();
			vetor[NumeroQuarto] = new Pensionato(nome, email);
			System.out.println();
		}

		System.out.println("Quartos alugados:");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}

		lerTeclado.close();
	}

}
