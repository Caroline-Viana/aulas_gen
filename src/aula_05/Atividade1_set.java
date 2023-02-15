package aula_05;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade1_set {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numero = new HashSet<Integer>();
		
		int valor;
		boolean continuar;
		
		System.out.println("Quer inserir um número? 1 - true ou 2 - false");
		continuar = leia.nextBoolean();
		
		while(continuar == true) {
			System.out.println("Digite o numero desejada: ");
			valor = leia.nextInt();
			numero.add(valor);
			
			System.out.println("Quer inserir um número? 1 - true ou 2 - false");
			continuar = leia.nextBoolean();
		}
		
		System.out.println("Listar todas os números");
		numero.forEach(System.out::println);


	}

}
