package estoque;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return "nome: " + nome + ", preço: " + String.format("%.2f", preco) + "," + " quantidade: " + quantidade;
	}
	
	
}
