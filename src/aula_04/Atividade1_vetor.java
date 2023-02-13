package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade1_vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int vetor[] = new int[4];
		int numeroEscolhido;

		for (int contador = 0; contador < vetor.length; contador++) {
			System.out.println("Digite um valor: ");
			vetor[contador] = leia.nextInt();
		}

		Arrays.sort(vetor);

		System.out.println("Digite o número que você deseja encontrar :");
		numeroEscolhido = leia.nextInt();

		if (Arrays.binarySearch(vetor, numeroEscolhido) != -1) {
			System.out.println("O número " + numeroEscolhido + " está localizado na posição: "
					+ Arrays.binarySearch(vetor, numeroEscolhido));
		} else
			System.out.println("O número " + numeroEscolhido + " não foi encontrado!");

		leia.close();

	}

}
