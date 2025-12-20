package day2_13122025.part2CoreJavaAPI;

import java.util.ArrayList;
import java.util.List;

public final class Animal {  // rule 1 : classe doit être final
	private final int age; // rule 2 : les attributs sont private et final
	private final String espece; 
	private final List<String>foods;
	
	public Animal(int age, String espece, List<String> foods) {
		this.age = age;
		this.espece = espece;
		this.foods = new ArrayList(foods);
	}

	public int getAge() {
		return age;
	}

	//public void setAge(int age) {  // Regle 3 : Setters
	//	this.age = age;
	//}

	public String getEspece() {
		return espece;
	}

	//public void setEspece(String espece) {
	//	this.espece = espece;
	//}

	public List<String> getFoods() { // regle 4 : retour des types mutables
		return new ArrayList(foods);
	}

	//public void setFoods(List<String> foods) {
	//	this.foods = foods;
	//}
}
