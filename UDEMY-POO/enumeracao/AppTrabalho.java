package enumeracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AppTrabalho {

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Entre com os dados do trabalhador");
		System.out.print("Departamento: ");
		String nomeDepartamento = input.nextLine();
		System.out.print("Nome: ");
		String nome = input.nextLine();
		System.out.print("Nível: ");
		String nivelTrabalhador = input.nextLine();
		System.out.print("Salário base: ");
		double salarioBase = input.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nome, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase,
				new Departamento(nomeDepartamento));

		System.out.print("Quantos contratos o trabalhador terá? ");
		int contratos = input.nextInt();

		for (int i = 1; i <= contratos; i++) {
			System.out.println("Entre com dados do " + i + " contrato");
			System.out.print("Data: (DD/MM/YYYY): ");
			Date dataContrato = sdf.parse(input.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = input.nextDouble();
			System.out.print("Duração (horas): ");
			int horas = input.nextInt();
			HoraContrato contrato = new HoraContrato(dataContrato, valorPorHora, horas);
			trabalhador.adicionarContrato(contrato);
		}

		System.out.println();
		System.out.print("Entre com mês e ano para calcular a renda (DD/MM/YYYY): ");
		String mesEAno = input.next();
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Valor de: " + mesEAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));

		input.close();
	}

}
