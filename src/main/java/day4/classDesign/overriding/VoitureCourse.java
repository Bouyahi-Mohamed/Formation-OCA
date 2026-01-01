package day4_27122025.classDesign.overriding;

public class VoitureCourse extends Voiture{
	String marque = "Polo 8";
	@Override
	public void info()
	{
		System.out.println("VoitureCourse");
	}
}
