package aula_04;

import java.util.Scanner;

public class Atividade1_matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int soma;

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				if (indiceI == indiceJ) {
					System.out.println(matriz[indiceI][indiceJ]);

				}

			}

		}

	}

}
