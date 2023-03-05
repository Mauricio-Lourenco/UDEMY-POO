package estoque;

import java.util.Scanner;

public class AppProduto {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Produto produto = new Produto();

		System.out.println("Entre com dados do Produto");
		System.out.print("Nome: ");
		produto.nome = entrada.next();
		System.out.print("Preço: ");
		produto.preco = entrada.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantidade = entrada.nextInt();
		System.out.println("Valor em estoque: " + produto.valorTotalEstoque());

		System.out.println();
		System.out.print(produto);
		System.out.println();
		System.out.print("Quantos produtos serão adicionados? ");
		int adicao = entrada.nextInt();
		produto.adicionarProduto(adicao);

		System.out.print("Valor em estoque: " + produto.valorTotalEstoque());

		System.out.println();
		System.out.print(produto);
		System.out.println();
		System.out.print("Quantos produtos serão removidos? ");
		int remocao = entrada.nextInt();
		produto.removerProduto(remocao);

		System.out.print("Valor em estoque: " + produto.valorTotalEstoque());
		System.out.println();
		System.out.print(produto);

		entrada.close();
	}

}
