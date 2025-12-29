package day3_20122025.chapitre4.constructeurs;

public class Animal {
	public  Animal() {
		this(10);
		System.out.println("Animal");
	}
	public  Animal(int age) {
		this(10,"Chat");
		System.out.println("Animal avec age");
	}
	public Animal(int age, String espece) {
		System.out.println("Animal avec age et espece");
	}

}
