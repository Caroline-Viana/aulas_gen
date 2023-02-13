package aula_04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int matrizInteiros[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };

		float[][] matriz = new float[2][2];

		// Ler as linhas
		for (int indiceI = 0; indiceI < matrizInteiros.length; indiceI++) {

			// Ler as colunas
			for (int indiceJ = 0; indiceJ < matrizInteiros.length; indiceJ++) {
				System.out.println(matrizInteiros[indiceI][indiceJ]);
			}
		}

		// Ler as linhas
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			// Ler as colunas
			for (int indiceJ = 0; indiceJ < matriz.length; indiceJ++) {
				System.out.println("Digite um valor real: ");
				matriz[indiceI][indiceJ] = leia.nextFloat();
			}
		}
		
		for (float [] vetor : matriz) {
			for (var elemento : vetor) {
				System.out.println(elemento);
			}
		}
		
		String[][] matrizNomes = new String[2][3];
        
        for (int linha = 0; linha < matrizNomes.length; linha++) {
            for (int coluna = 0; coluna < matrizNomes[linha].length; coluna++) {

                System.out.println(
                    "Digite um nome para a posição [" + linha + "][" + coluna + "]: ");
                matrizNomes[linha][coluna] = leia.next();
            }
        }
        
        for (int linha = 0; linha < matrizNomes.length; linha++) {
            for (int coluna = 0; coluna < matrizNomes[linha].length; coluna++) {
                System.out.println(
                    "O nome armazenado na posição [" + linha + "][" + coluna + "] é: "
                        + matrizNomes[linha][coluna]);
            }
        }
        
        System.out.println(
            "\nSua Matriz tem " + matrizNomes.length + " linhas e " + 
            matrizNomes[0].length + " colunas.");

		leia.close();

	}

}
