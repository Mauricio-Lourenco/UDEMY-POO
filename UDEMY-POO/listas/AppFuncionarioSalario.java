package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppFuncionarioSalario {

	static Scanner input = new Scanner(System.in);
	static List<Funcionario> funcionario = new ArrayList<>();

	public static void main(String[] args) {

		System.out.print("Quantos funcionários Deseja Registrar? ");
		int funcionarios = input.nextInt();

		for (int i = 0; i < funcionarios; i++) {
			System.out.println();
			System.out.print("Funcionário " + (i + 1) + " ");
			System.out.print("Id: ");
			Integer id = input.nextInt();
			System.out.print("Nome: ");
			input.nextLine();
			String nome = input.next();
			System.out.print("Salário: ");
			Double salario = input.nextDouble();

			Funcionario trabalhador = new Funcionario(id, nome, salario);

			funcionario.add(trabalhador);

		}

		System.out.println("Entre com o Id do funcionário que terá aumento de salário");
		Integer salarioId = input.nextInt();
		Integer posicao = posicaoId(funcionario, salarioId);
		if (posicao == null) {
			System.out.println("Esse Id não existe");
		} else {
			System.out.println("Entre com a porcentagem: ");
			double porcentagem = input.nextDouble();
			funcionario.get(posicao).aumentarSalario(porcentagem);
		}
		
		System.out.println();
		System.out.println("Lista de funcionários: ");
		
		for(Funcionario funcionario : funcionario) {
			System.out.println(funcionario);
		}

	}

	public static Integer posicaoId(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
