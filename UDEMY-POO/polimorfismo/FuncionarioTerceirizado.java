package polimorfismo;

public class FuncionarioTerceirizado extends Funcionario {
	private double dispesaAdicional;

	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer hora, double valorHora, double dispesaAdicional) {
		super(nome, hora, valorHora);
		this.dispesaAdicional = dispesaAdicional;
	}

	@Override
	public double pagamento() {
		return super.pagamento() + dispesaAdicional * 1.1;
	}

	public double getDispesaAdicional() {
		return dispesaAdicional;
	}

	public void setDispesaAdicional(double dispesaAdicional) {
		this.dispesaAdicional = dispesaAdicional;
	}

}
