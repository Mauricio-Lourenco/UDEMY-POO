package triangulo;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe o lado A: ");
		double ladoA = entrada.nextDouble();
		System.out.print("Informe o lado B: ");
		double ladoB = entrada.nextDouble();
		System.out.print("Informe o lado C: ");
		double ladoC = entrada.nextDouble();

		double semiP = (ladoA + ladoB + ladoC) / 2;

		double area = Math.sqrt
				(semiP * 
				(semiP - ladoA) * 
				(semiP - ladoB) * 
				(semiP - ladoC));

		System.out.println();
		if (ladoA == ladoB && ladoB == ladoC) {
			System.out.print("Triângulo Equilátero");
		} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.print("Triângulo Isósceles");
		} else {
			System.out.print("Triângulo Escaleno");
		}

		System.out.println();
		System.out.printf("Área do Triângulo: %.3f ", area);		
		entrada.close();
	}

}
