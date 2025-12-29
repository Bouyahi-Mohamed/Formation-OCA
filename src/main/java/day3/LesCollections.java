package day3_20122025;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LesCollections {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		ArrayList<String> noms = new ArrayList<>();
		
		
		names = new LinkedList<String>();
		
		
		names.add("amine");
		names.add("sami");
		names.add("10");
		names.add("true");
		for(Object o : names)
		{
			String temp = (String)o;
			System.out.println(temp.toUpperCase());
		}
		
		LinkedList l = new LinkedList();

	}

}
