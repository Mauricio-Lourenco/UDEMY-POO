package funcionario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AplicacaoFuncionario {

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Nome do departamento: ");
		String nomeDepartamento = input.nextLine();
		System.out.println("Dados do Trabalhador");
		System.out.print("Nome: ");
		String nomeTrabalhador = input.nextLine();
		System.out.print("Nível: ");
		String nivelTrabalhador = input.nextLine();
		System.out.print("Salário Base: ");
		double salarioBase = input.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador),
				salarioBase, new Departamento(nomeDepartamento));

		System.out.println("Quantos contratos deseja exercer?");
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Informe dados do contrato " + (i+1));
			System.out.println("Data [DD/MM/YYYY]: ");
			Date dataContrato = sdf.parse(input.next());
			System.out.print("Valor por hora: ");
			double valorHora = input.nextDouble();
			System.out.print("Duração (Horas): ");
			int horasDuracao = input.nextInt();

			HoraContrato contrato = new HoraContrato(dataContrato, valorHora, horasDuracao);

			trabalhador.adicionarContrato(contrato);

		}
		
		System.out.println();
		System.out.println("Informe Mês e Ano pra calcular renda [MM/YYYY] ");
		String mesAno = input.next();
		int mes = Integer.parseInt(mesAno.substring(0,2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda para " + mesAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
		

		input.close();

	}

}
