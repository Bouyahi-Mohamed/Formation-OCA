package day1_06122025.part5;

public class Main {

	public static void main(String[] args) {
		/*
		int x = 1_000_000;
		double moy = 1_2.5;
		System.out.println(Long.MAX_VALUE);
		long nbr = 92233720368547L;
		float val = 12.5F;
		float t;*/
		//int x = 10;
		//int y = x++; // post-increment
		/*
		int y = ++x;
		System.out.println(x);
		System.out.println(y);*/
		/*
		int x = 100;
		int y = 50;
		//boolean res = (x > 200) && (++y > 3); // AND
		boolean res = (x > 200) & (++y > 3);  // AND
		System.out.println("res = "+res);
		System.out.println("y = "+y);*/
		
		int x = 100;
		int y = 50;
		boolean res = (x < 200) | (++y > 3); // AND
		System.out.println("res = "+res);
		System.out.println("y = "+y);
		
		int h = (x<y)?2:3;
		System.out.println(h);
		
		System.out.println((x<y)?true:"ok");
		
		byte k1 = 2;
		byte k2 = 1;
		int resK = k1+k2;
		byte m = 127;
		m++;
		System.out.println(m);
		
		

	}

}
