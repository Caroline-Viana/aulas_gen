package aula_06;
import static aula_06.package2.Classe2.*;
public class TestaMetodos {

	public static void main(String[] args) {

		metodoPublic();
		System.out.println(soma(2, 4));
		metodoPadrao();
		metodoProtegido();
		metodoPrivado();
		
		Classe1.metodoPublico1();
		Classe1.metodoFriendly1();
		Classe1.metodoProtegido1();
		
		metodoPublicoPacote1();
	}
	
	public static void metodoPublic() {
		System.out.println("Eu sou um método publico!");
	}
	
	public static int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	static void metodoPadrao() {
		System.out.println("Eu sou um método friendly!");
	}
	
	protected static void metodoProtegido() {
		System.out.println("Eu sou um método protegido!");
	}
	
	private static void metodoPrivado() {
		System.out.println("Eu sou um método privado!");
	}

}
