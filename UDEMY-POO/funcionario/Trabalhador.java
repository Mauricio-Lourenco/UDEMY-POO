package funcionario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

	private String nome;
	private NivelTrabalhador nivel;;
	private Double salarioBase;

	private Departamento departamento;
	private List<HoraContrato> contratos = new ArrayList<>();

	public Trabalhador() {

	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.nivel = nivel;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContrato> getContratos() {
		return contratos;
	}

	public void adicionarContrato(HoraContrato contrato) {
		contratos.add(contrato);
	}

	public void removerContrato(HoraContrato contrato) {
		contratos.remove(contrato);
	}

	public Double renda(Integer ano, Integer mes) {
		double soma = salarioBase;
		Calendar cal = Calendar.getInstance();
		for (HoraContrato c : contratos) {
			cal.setTime(c.getData());
			int anoContrato = cal.get(Calendar.YEAR);
			int mesContrato = 1 + cal.get(Calendar.MONTH);
			if (ano == anoContrato && mes == mesContrato) {
				soma += c.valorTotal();
			}
		}
		return soma;
	}
}
