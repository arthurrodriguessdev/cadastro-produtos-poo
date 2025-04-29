package CadastroDeProdutos;

import java.util.Locale;
import java.util.Scanner;

public class ProgramaCadastro {
public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Criação de 3 objetos (Produtos) e cadastro de dados
		Produtos produto1 = new Produtos();
		Produtos produto2 = new Produtos();
		Produtos produto3 = new Produtos();
		
		System.out.println("--- CADASTRO PRODUTO 01 --- ");
		System.out.print("Informe o nome do produto: ");
		produto1.nome = sc.nextLine();
		System.out.print("Informe o preço original do produto: ");
		produto1.preco = sc.nextDouble();
		System.out.print("Informe o desconto do produto (%): ");
		produto1.desconto = sc.nextDouble();
		System.out.println();
		
		sc.nextLine();
		
		System.out.println("--- CADASTRO PRODUTO 02 --- ");
		System.out.print("Informe o nome do produto: ");
		produto2.nome = sc.nextLine();
		System.out.print("Informe o preço original do produto: ");
		produto2.preco = sc.nextDouble();
		System.out.print("Informe o desconto do produto (%): ");
		produto2.desconto = sc.nextDouble();
		System.out.println();
		
		sc.nextLine();
		
		System.out.println("--- CADASTRO PRODUTO 03: --- ");
		System.out.print("Informe o nome do produto: ");
		produto3.nome = sc.nextLine();
		System.out.print("Informe o preço original do produto: ");
		produto3.preco = sc.nextDouble();
		System.out.print("Informe o desconto do produto (%): ");
		produto3.desconto = sc.nextDouble();
		System.out.println();
		
		sc.close();
		
		produto1.exibirInformacoes();
		System.out.println();
		
		produto2.exibirInformacoes();
		System.out.println();

		produto3.exibirInformacoes();;
	}

}
