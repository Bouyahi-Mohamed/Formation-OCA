package day3_20122025.chapitr4.passageParametres;

public class Test {
	
	public static void permut(int a, int b )
	{
		int temp;
		temp = a;
		a = b;
		b = temp;
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		permut(x,y);
		System.out.println("x = "+x); // x = 20;
		System.out.println("y = "+y); // y = 10;

	}

}
