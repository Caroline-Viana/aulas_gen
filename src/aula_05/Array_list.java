package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_list {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<Double> notas = new ArrayList<Double>();

		int opcao = 0;
		double nota = 0.0;
		
		//menu
		do {
			System.out.println("1 - Cadastrar nota"); //adicionar
			System.out.println("2 - Listar notas");
			System .out.println("3 - Buscar uma nota"); //pesquisar
			System .out.println("4 - Remover uma nota"); //remover
			System .out.println("5 - Aualizar uma nota"); //atualizar
			System.out.println("6 - Sair");
			System.out.println("Digite a opção desejada: ");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite uma nota entre 1 e 10");
				nota = leia.nextDouble();
				notas.add(nota);
				break;
			case 2:
				System.out.println("Listar todas as notas");
				if(notas.isEmpty())
					System.out.println("Base de dados vazia");
				else
					notas.forEach(System.out::println);
				break;
			case 3:
				System.out.println("Procurar uma nota");
				System.out.println("Digite a nota: ");
				nota = leia.nextDouble();
				System.out.println("A nota " + nota + " existe? " + notas.contains(nota));
				System.out.println("O indice da minha nota é " + notas.indexOf(nota));
				break;
			case 4:
				System .out.println("Digite a nota que você quer remover");
				nota = leia.nextDouble();
				notas.remove(nota); //nota
				//notas.remove(notas.indexOf(nota)); //indice da nota
				break;
			case 5:
				System .out.println("Digite nita atual: ");
				nota = leia.nextDouble();
				System .out.println("Digite nova nota: ");
				double notaNova = leia.nextDouble();
				notas.set(notas.indexOf(nota), notaNova);
				break;
			default:
				if(opcao >= 6)
					System.out.println("Opção inválida!");
			}

		} while (opcao != 6);

	}

}
