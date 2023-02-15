package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1_Fila {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		String nome;
		int opcao = 0;

		System.out.println("1 - Menu");
		System.out.println("2 - Sair");
		System.out.println("Digite a opção desejada: ");
		opcao = leia.nextInt();

		while(opcao == 1) {
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente");
			System.out.println("0 - Sair");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();
			
			if (opcao == 1) {
			System.out.println("Digite um nome: ");
			leia.skip("\\R?");
			nome = leia.nextLine();
			fila.add(nome);
			}
			
			if (opcao == 2) {
				System.out.println(fila);
			}
			
			if (opcao == 3) {
				System.out.println("Retirar um elemento da fila");
				System.out.println(fila.poll());
				System.out.println(fila);
			}
		}
	}
}
