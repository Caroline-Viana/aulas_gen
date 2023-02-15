package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Atividade1_pilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		String nome;
		int opcao = 0;
		
		for(int contador = 1; contador != 0; contador++) {
			System.out.println("1 - Adicionar um livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livros");
			System.out.println("0 - Sair");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("Programa finalizado!");
				leia.close();
				System.exit(0);
				}
				
			switch(opcao) {
			case 1:
				System.out.println("Digite um nome: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				pilha.push(nome);
				System.out.println("Livro Adicionado!");
				break;
			case 2:
				pilha.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Retirar um elemento da fila");
				if(pilha.isEmpty())
					System.out.println("A Pilha está vazia!");
				else
					System.out.println("O livro " + pilha.pop() + " foi retirado da pilha!");
				break;
			default:
				System.out.println("Opção inválida");
			}
		}
		
	}

}
