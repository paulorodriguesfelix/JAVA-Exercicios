package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto= new Produto();
		
		System.out.println("Adicionar Prodrutos:");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preço:");
		produto.preco = sc.nextDouble();
		
		System.out.println("Quantidade:");
		produto.quantidade = sc.nextInt();
		
		System.out.println(produto);
		System.out.println();
		System.out.println("Deseja adicionar quantos produtos?");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println(produto);
		System.out.println();
		System.out.println("Deseja remover quantos produtos?");
		quantidade = sc.nextInt();
		
		produto.removerProdutos(quantidade);
		System.out.println(produto);
		
		
		sc.close();
	}

}
