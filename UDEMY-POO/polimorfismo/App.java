package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {

	public static void main(String[] args) {

		Scanner lerTeclado = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();

		System.out.print("Número de Funcionários: ");
		int funcionarios = lerTeclado.nextInt();

		for (int i = 1; i < funcionarios; i++) {
			System.out.println("Dados do #" + i + " :");
			System.out.print("Terceirizado? [s/n]");
			char situacao = lerTeclado.next().charAt(0);
			System.out.print("Nome: ");
			String nome = lerTeclado.next();
			System.out.print("Horas: ");
			double hora = lerTeclado.nextDouble();
			System.out.print("Valor por Hora: ");
			double valorHora = lerTeclado.nextDouble();
			if (situacao == 's') {
				System.out.print("Gasto Adicional: ");
				double gasto = lerTeclado.nextDouble();
			
			} else {

			}
		}

		lerTeclado.close();
	}

}
