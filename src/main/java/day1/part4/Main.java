package day1_06122025.part4;

public class Main {

	public static void produit(double ...tab)
	{}
	
	public static void somme(int x, double ...tab)
	{}
	public static void main(String ... args) {
		System.out.println(args[2]);
		somme(2);
		somme(10);
		somme(10,2,5,8);
		produit(new double[] {10,3,4});

	}

}
