package day4_27122025;

@FunctionalInterface
public interface Filtrage {
	
	public boolean test(String word);
	
	public default void display(String ch)
	{
		System.out.println("Hello : "+ ch);
	}
	
	public static void displayStatic(String ch)
	{
		System.out.println("Hello : "+ ch);
	}
	
}
