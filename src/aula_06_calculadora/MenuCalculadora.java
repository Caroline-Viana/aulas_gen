package aula_06_calculadora;

import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Calculos calc = new Calculos();
		int opcao;
		double n1, n2;

		while (true) {
			System.out.println("1 - soma");
			System.out.println("2 - subtração");
			System.out.println("3 - multiplicação");
			System.out.println("4 - divisão\n");

			System.out.println("Digite o número da Operação: ");
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.exit(0);
				leia.close();
			}

			System.out.println("Digite o 1° número: ");
			n1 = leia.nextDouble();

			System.out.println("Digite o 2° número: ");
			n2 = leia.nextDouble();

			switch (opcao) {
			case 1 -> System.out.println("Soma: " + calc.soma(n1, n2));
			case 2 -> System.out.println("Subtração: " + calc.subtracao(n1, n2));
			case 3 -> System.out.println("Multiplicação: " + calc.multiplicacao(n1, n2));
			case 4 -> System.out.println("Divisão: " + calc.divisao(n1, n2));
			default -> System.out.println("Opção inválida!");
			}
		}

	}

}
