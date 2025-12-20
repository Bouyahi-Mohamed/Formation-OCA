package day2_13122025.part1;

public class Exemple_Switch {

	public static void main(String[] args) {
		String libelle = "oca";
		String f1 = "oca";
		final String f2 = "OCP";
		final String f3 = "Spring";
		switch(libelle)
		{
		case f1 : System.out.println("Certif OCA"); break;
		case f2 : System.out.println("Certif OCA"); break;
		}
		Day d = Day.TUESDAY;
		switch(d)
		{
		case MONDAY : System.out.println("Certif OCA"); break;
		case Day.TUESDAY : System.out.println("Certif OCA"); break;
		}

	}

}
