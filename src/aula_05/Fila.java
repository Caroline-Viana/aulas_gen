package aula_05;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Carol");
		fila.add("Rony");
		fila.add("Lucas");
		fila.add("Eli");
		fila.add("Laise");
		fila.add("Fernando");
		
		Iterator<String> iFila = fila.iterator();
		
		while(iFila.hasNext()) {
			System.out.println(iFila.next());
		}
		
		System.out.println("Retirar um elemento ta fila");
		System.out.println(fila.poll());
		
		System.out.println("Fila atualizado");
		
		for(var elemento : fila)
			System.out.println(elemento);
		

	}

}
