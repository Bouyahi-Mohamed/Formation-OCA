package day2_13122025.part1;

public class Test_InstanceOf {
	
	public static void whatAnimalIs(Object obj)
	{
		if (obj instanceof Oiseau)
			System.out.println("Oiseau");
		else if(obj instanceof Poisson)
			System.out.println("Poisson");
		else System.out.println("Animal");
	}

	public static void main(String[] args) {
		Oiseau o = new Oiseau();
		Poisson p = new Poisson();
		whatAnimalIs(o);
		whatAnimalIs(p);
		whatAnimalIs(new Object());
		Day v = Day.MONDAY;
	}

}
