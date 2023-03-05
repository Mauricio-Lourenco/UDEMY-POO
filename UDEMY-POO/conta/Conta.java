package conta;

public class Conta {
	int numero;
	String tipo;
	double saldo;

	public void cadastrarConta(int numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
	}

	public void deposito(double deposito) {
		saldo += deposito;
	}

	public boolean saque(double saldo) {
		boolean saque = false;
		if (this.saldo >= saldo) {
			this.saldo -= saldo;
			saque = true;
		} else {
			System.out.println("Saldo insuficiente");
		}
		return saque;
	}

	public double mostrarSaldo() {
		return saldo;
	}
}
