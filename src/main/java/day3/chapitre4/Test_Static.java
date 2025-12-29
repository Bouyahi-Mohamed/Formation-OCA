package day3_20122025.chapitre4;

import java.util.ArrayList;

public class Test_Static {
	private static final ArrayList<String> values = new ArrayList<>();
	static final int MAX_AGE = 10;
	public static void main(String[] args) {
		values.add("changed");
		MAX_AGE = 12;
		values = new ArrayList<>();
	}
}
