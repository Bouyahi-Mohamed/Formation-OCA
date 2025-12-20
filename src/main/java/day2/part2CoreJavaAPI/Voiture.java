package day2_13122025.part2CoreJavaAPI;

public class Voiture {
	String marque;
	String modele;
	public Voiture(String marque, String modele) {
		super();
		this.marque = marque;
		this.modele = modele;
	}
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", modele=" + modele + "]";
	}

}
