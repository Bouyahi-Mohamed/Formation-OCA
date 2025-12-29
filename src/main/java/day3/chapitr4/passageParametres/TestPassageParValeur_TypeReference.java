package day3_20122025.chapitr4.passageParametres;

public class TestPassageParValeur_TypeReference {

	public static void modifStringBuilder(StringBuilder sb)
	{
		sb.append("-OCP");
	}
	
	public static void modifString(String s)
	{
		s = s.concat("-OCP");
	}
	
	public static void main(String[] args) {
		/*
		StringBuilder test = new StringBuilder("OCA");
		System.out.println(test);
		modifStringBuilder(test);
		System.out.println(test);
		*/
		String test = new String("OCA");
		System.out.println(test);
		modifString(test);
		System.out.println(test);

	}

}
