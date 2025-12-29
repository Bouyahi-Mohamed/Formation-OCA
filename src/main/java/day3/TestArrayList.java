package day3_20122025;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		// isEmpty(); size()
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		// add(E), add(int, E), set(int, F)
		names.add("farah");
		System.out.println(names.isEmpty());
		System.out.println(names.size());
		names.set(0,"arbi");
		System.out.println(names);
		names.add(0,"farah");
		System.out.println(names);
		System.out.println(names.contains("farah"));
		System.out.println(names.contains("amine"));
		System.out.println(names.remove("amine"));
		System.out.println(names);
		System.out.println(names.remove(10));
		System.out.println(names);

	}

}
