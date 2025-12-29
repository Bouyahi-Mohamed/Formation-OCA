package day3_20122025.chapitre4;

public class SignatureMethode {

	public static final void display(String nom) throws IllegalArgumentException
	{
		if(nom.length()<2)
		{
			throw new IllegalArgumentException("Le nom : "+nom + "est invalide !"); 
		}
		else
			System.out.println("Votre nom est : " +nom.toUpperCase());
	}
	public static void main(String[] args) {
		
		try {
		display("amine");
		display("a");
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Oups : "+ e.getMessage());
		}
		System.out.println("Fin programme");

	}

}
