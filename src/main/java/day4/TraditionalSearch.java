package day4_27122025;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TraditionalSearch {

    public static void main(String[] args) {
    	
    	Predicate<Animal> filterCanHop = a->a.canHop();
    	Predicate<Animal> filterCanSwim = a->a.canSwim();
    	
    	
    	CheckTrait checkCanHop = a->a.canHop();
    	CheckTrait checkCanSwim = a->a.canSwim();
    	
        List<Animal> animals = new ArrayList<>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

       // print(animals, new CheckIfHopper()); // pass class that does check
        
        print(animals, filterCanHop);
        
        print(animals, filterCanSwim);
        
        print(animals, a->a.canSwim());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {   // the general check
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }
    
    /*
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {   // the general check
                System.out.print(animal + " ");
            }
        }
        System.out.println();
    }*/
}
