package aula_05;

import java.util.HashSet;
import java.util.Set;

public class Lista_set {

	public static void main(String[] args) {
		Set<Double> notas = new HashSet<Double>();
		
		notas.add(7.0);
		notas.add(6.0);
		notas.add(2.0);
		notas.add(5.0);
		notas.add(7.0);
		
		System.out.println("Listar todas as notas");
		notas.forEach(System.out::println);
		
		System .out.println("Remover uma nota");
		notas.remove(20.0);
		notas.forEach(System.out::println);
		
		System.out.println("A nota 7 existe? " + notas.contains(7.0));
		

	}

}
