package CadastroDeProdutos;

public class Produtos { // Classe molde
	
	// Criação de atributos
	String nome;
	double preco, desconto, valorFinal;
	
	// Criação dos métodos
	public void exibirInformacoes() {
		System.out.println("Produto: " + nome);
		System.out.println("Preço original: R$" + preco);
		System.out.println("Desconto: " + desconto + "%");
		System.out.printf("Valor final: R$%.2f%n", calcularValorFinal());
	}
	
	public double calcularValorFinal() {
		valorFinal = preco - ((preco * desconto) / 100);
		return valorFinal;
	}
	
}
