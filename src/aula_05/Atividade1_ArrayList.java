package aula_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1_ArrayList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		String cor;
		int continuar;
		
		System.out.println("Quer inserir uma cor? 1 - Simm ou 2 - Não");
		continuar = leia.nextInt();
		
		while(continuar == 1) {
			System.out.println("Digite a cor desejada: ");
			leia.skip("\\R?");
			cor = leia.nextLine();
			cores.add(cor);
			
			System.out.println("Quer inserir uma cor? 1 - Simm ou 2 - Não");
			continuar = leia.nextInt();
		}
			
		System.out.println("Listar todas as cores: " + cores);
		
		Collections.sort(cores);
		
		System.out.println("Ordenar as cores: " + cores);
		
		leia.close();
	}

}
