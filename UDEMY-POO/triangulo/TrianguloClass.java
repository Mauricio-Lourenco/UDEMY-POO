package triangulo;

public class TrianguloClass {
	public double ladoA;
	public double ladoB;
	public double ladoC;

	public double area() {
		double semiP = (ladoA + ladoB + ladoC) / 2;
		double area = Math.sqrt(semiP * (semiP - ladoA) * (semiP - ladoB) * (semiP - ladoC));
		return area;
	}

	public String tipo() {
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
