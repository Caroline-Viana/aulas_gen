package aula_04;

import java.util.Scanner;

public class Atividade2_vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int vetor[] = new int[10];
		float soma = 0.0f;
		float media = 0.0f;

		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.println("Digite um valor: ");
			vetor[contador] = leia.nextInt();
		}
		
		System.out.println("\nElementos nos índices ímpares:\n");

		for (int contador = 0; contador < vetor.length; contador++) {
			if (contador % 2 != 0)
				System.out.println(vetor[contador]);
		}
		
		System.out.println("\nElementos pares:\n");

		for (int contador = 0; contador < vetor.length; contador++) {
			soma += vetor[contador];
			media = soma / vetor.length;
			if ((vetor[contador] % 2) == 0)
				System.out.println(vetor[contador]);
		}
		
		System.out.println("\nSoma: " + soma);
		System.out.println("\nMédia: " + media);
		
		leia.close();

	}

}
