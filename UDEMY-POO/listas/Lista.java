package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		// Declaração e Criação da Lista;
		List<String> nomes = new ArrayList<>();

		// Inserção de Elementos;
		nomes.add("Maria");
		nomes.add("Maurício");
		nomes.add("Rizonete");
		nomes.add("Rebeca");
		nomes.add("Elias");

		// Mostrar tamanho;
		System.out.println(nomes.size());

		System.out.println("--------------");

		// Laço for each para mostrar componemtes;
		for (String x : nomes) {
			System.out.println(x);
		}

		System.out.println("--------------");

		// Remoção de elementos (Condicional);
		nomes.removeIf(x -> x.charAt(0) == 'M');

		for (String x : nomes) {
			System.out.println(x);
		}

		System.out.println("--------------");

		// Encontrar posição na lista;
		System.out.println("Rebeca está na posição: " + nomes.indexOf("Rebeca"));
		System.out.println("Marco está na posição: " + nomes.indexOf("Maurício"));

		System.out.println("--------------");

		// Filtrar lista com base em predicado;
		List<String> resultado = nomes.stream().filter(x -> x.charAt(0) == 'E').collect(Collectors.toList());

		for (String x : resultado) {
			System.out.println(x);
		}

		System.out.println("--------------");

		// Encontrar primeira ocorrência;

		String list = nomes.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(list);
	}

}
