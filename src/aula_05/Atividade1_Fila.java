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

		while(true) {
			System.out.println("1 - Adicionar cliente na fila");
			System.out.println("2 - Listar todos os clientes");
			System.out.println("3 - Retirar cliente");
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
				fila.add(nome);
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				fila.forEach(System.out::println);
				break;
			case 3:
				if(fila.isEmpty())
					System.out.println("A fila está vazia!");
				else
					System.out.println("Cliente " + fila.poll() + " foi Chamado!");
				break;
			default:
				System.out.println("Opção inválida");
			}
			
		}
	}
}
