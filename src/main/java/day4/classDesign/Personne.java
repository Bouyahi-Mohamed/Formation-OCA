package day4_27122025.classDesign;

public class Personne {
	//implicitement, java crée un constructeur par défaut
	public Personne(String nom) {}
	public Personne() {}
	
	protected Personne info() throws Exception
	{
		System.out.println("Personne");
		return new Personne();
	}
}
