package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		
		pilha.push("Carol");
		pilha.push("Rony");
		pilha.push("Lucas");
		pilha.push("Eli");
		pilha.push("Laise");
		pilha.push("Fernando");
		
		for (var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Remover 1 elemento da pilha");
		
		pilha.pop();
		
		for (var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Topo da pilha" + pilha.peek());
	}

}
