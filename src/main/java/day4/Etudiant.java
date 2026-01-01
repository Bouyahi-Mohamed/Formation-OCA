package day4_27122025;

public class Etudiant {
	String nom;
	int age;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Etudiant(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
