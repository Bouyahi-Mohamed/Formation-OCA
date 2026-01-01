package day4_27122025;

public class Main {

	public static void main(String[] args) {
		//Scénario 1 : vérifier avec l'interface si la chaine contain oca
		
		//Filtrage f1 = (String ch)->{return ch.contains("oca");}; // expression verbose
		
		Filtrage f1 = ch->ch.contains("oca");  // expression réduite
		
		System.out.println(f1.test("formation java oca ocp"));
		System.out.println(f1.test("formation java ocp"));
		
		//Scénario 2 : vérifier avec l'interface si la chaine commence par oca
		Filtrage f2 = (String ch)->{return ch.startsWith("oca");};
		System.out.println(f2.test("oca training"));
	}

}
