package day2_13122025.part2CoreJavaAPI.lesTableaux;

import java.util.Arrays;

public class LesTableaux {

	public static void main(String[] args) {
		// Tableau à 1 Dimension
		int tab[] = {10,3};
		String names [] = {"farak","refka"};
		System.out.println(names.length);
		System.out.println(names[1]);
		int numbers[] = {2,1,18,4,6,9};
		for(int e : numbers)
		{
			System.out.print(e+"\t");
		}
		System.out.println();
		Arrays.sort(numbers);
		for(int e : numbers)
		{
			System.out.print(e+"\t");
		}
		// Tableau multi-dimensions
		
		int[][]tab2 = new int[2][];
		tab2[0] = new int[6];
		tab2[1] = new int[4];
	}

}
