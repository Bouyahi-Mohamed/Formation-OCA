package day4_27122025.classDesign.overriding;

public class Main {

	public static void main(String[] args) {
		Voiture v = new VoitureCourse();
		v.info();
		System.out.println(v.marque);
		VoitureCourse vc = new VoitureCourse();
		System.out.println(vc.marque);
	}

}
