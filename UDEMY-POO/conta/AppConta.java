package conta;

import java.util.Scanner;

public class AppConta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Informe o número da conta: ");
		int numero = input.nextInt();
		input.nextLine();
		System.out.print("Informe o tipo de conta:   ");
		String tipo = input.next();

		Conta conta = new Conta();
		conta.cadastrarConta(numero, tipo);

		System.out.println();
		System.out.print("==== Conta Cadastrada ====\n");

		System.out.print("Número: " + conta.numero);
		System.out.print("\nTipo:   " + conta.tipo);
		System.out.print("\nSaldo:  " + conta.saldo);

		System.out.println("\n==========================");
		System.out.println();
		System.out.println("Informe quanto deseja depositar");

		for (int i = 0; i < 3; i++) {
			double deposito = input.nextDouble();
			conta.deposito(deposito);
		}
		System.out.println("Saldo: " + conta.mostrarSaldo());
		System.out.println();
		System.out.println("Informe quanto deseja sacar");
		
		for (int i = 0; i < 2; i++) {
			double saque = input.nextDouble();
			conta.saque(saque);
		}
		
		System.out.println("Saldo: " + conta.mostrarSaldo());
		

		input.close();

	}

}
