package day4_27122025.classDesign;

import java.io.IOException;

public class Etudiant extends Personne{

	@Override
	public Etudiant info() throws IOException
	{
		System.out.println("Etudiant");
		return new Etudiant();
	}
}
