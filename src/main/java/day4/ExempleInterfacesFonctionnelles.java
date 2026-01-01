package day4_27122025;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExempleInterfacesFonctionnelles {

	public static void main(String[] args) {
		// Supplier
		Supplier<Double> rnd = ()->Math.random();
		System.out.println(rnd.get());
		//Consumer
		Consumer<String> display = ch ->{System.out.println(ch.toUpperCase());}; 
		display.accept("oca");
		BiConsumer<String, Number> annuaire = (nom,tel)->System.out.println(nom+" : "+tel);
		annuaire.accept("Amine",98787521);
		//Predicate
		Predicate<String> stringValide = s -> {if(s.length()>4) return true; else return false;};
		System.out.println(stringValide.test("sesame"));
	}

}
