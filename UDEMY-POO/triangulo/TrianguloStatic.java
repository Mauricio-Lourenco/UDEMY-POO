package triangulo;

import java.util.Scanner;

public class TrianguloStatic {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o lado A: ");
		double ladoA = entrada.nextDouble();
		System.out.print("Informe o lado B: ");
		double ladoB = entrada.nextDouble();
		System.out.print("Informe o lado C: ");
		double ladoC = entrada.nextDouble();

		System.out.printf("Medida da área: %.3f", area(ladoA, ladoB, ladoC));
		System.out.println();
		System.out.println("Tipo do Triângulo: " + tipo(ladoA, ladoB, ladoC));

		entrada.close();
	}

	public static double area(double ladoA, double ladoB, double ladoC) {
		double semiP = (ladoA + ladoB + ladoC) / 2;
		double area = Math.sqrt(semiP * (semiP - ladoA) * (semiP - ladoB) * (semiP - ladoC));
		return area;
	}

	public static String tipo(double ladoA, double ladoB, double ladoC) {
		String tipo;
		if (ladoA == ladoB && ladoB == ladoC) {
			tipo = "Triângulo Equilátero";
		} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			tipo = "Triângulo Isósceles";
		} else {
			tipo = "Triângulo Escaleno";
		}
		return tipo;
	}
}
