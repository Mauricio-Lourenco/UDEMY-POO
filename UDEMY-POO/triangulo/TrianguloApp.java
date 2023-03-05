package triangulo;

import java.util.Scanner;

public class TrianguloApp {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		TrianguloClass triangulo = new TrianguloClass();
		

		System.out.print("Informe o lado A: ");
		triangulo.ladoA = entrada.nextDouble();
		System.out.print("Informe o lado B: ");
		triangulo.ladoB = entrada.nextDouble();
		System.out.print("Informe o lado C: ");
		triangulo.ladoC = entrada.nextDouble();
		
		triangulo.area();
		triangulo.tipo();
		
		System.out.printf("Medida da área: %.2f", triangulo.area());
		System.out.print("\nTipo: " + triangulo.tipo());
		

		entrada.close();
	}

}
