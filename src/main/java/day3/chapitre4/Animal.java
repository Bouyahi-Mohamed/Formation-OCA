package day3_20122025.chapitre4;

public class Animal {
	private int age;
	public String espece;
	protected double poids;
	double taille; // package-private
	
	public void infos()
	{
		System.out.println(this.age);
	}
}
