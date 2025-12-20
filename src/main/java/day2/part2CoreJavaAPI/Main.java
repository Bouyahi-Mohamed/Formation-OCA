package day2_13122025.part2CoreJavaAPI;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> repas = new ArrayList<>();
		repas.add("meat");
		repas.add("fish");
		repas.add("water");
		Animal a = new Animal(2,"Chat",repas);
		///List<String> temp = a.getFoods();
		System.out.println(a.getFoods());
		//temp.clear();
		repas.clear();
		System.out.println(a.getFoods());

	}

}
