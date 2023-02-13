package aula_04;

import java.util.Scanner;

public class Atividade1_matriz {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				System.out.println("Digite um valor real: ");
				matriz[indiceI][indiceJ] = leia.nextInt();
			}
		}
		

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				if (indiceI == indiceJ) {
					System.out.println(matriz[indiceI][indiceJ]);
				}
			}
		}
		
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				if ((indiceI + indiceJ) == (matriz.length -1)) {
					System.out.println(matriz[indiceI][indiceJ]);
				}
			}
		}
		
		for (int diagonalPrincipal = 0; diagonalPrincipal < matriz.length; diagonalPrincipal++) {
			somaPrincipal += matriz[diagonalPrincipal][diagonalPrincipal];
			somaSecundaria += matriz[matriz.length - 1 - diagonalPrincipal][diagonalPrincipal];
		}
		
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaPrincipal);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaSecundaria);
		
		leia.close();
		
	}

}
