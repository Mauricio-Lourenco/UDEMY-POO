package polimorfismo;

public class Funcionario {
	private String nome;
	private Integer hora;
	private double valorHora;

	public Funcionario() {
	}

	public Funcionario(String nome, Integer hora, double valorHora) {
		this.nome = nome;
		this.hora = hora;
		this.valorHora = valorHora;
	}

	public double pagamento() {
		return hora * valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

}
