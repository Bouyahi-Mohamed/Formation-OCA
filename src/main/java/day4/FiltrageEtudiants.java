package day4_27122025;

import java.util.*;
import java.util.stream.Stream;

public class FiltrageEtudiants {

	public static void main(String[] args) {
		List<Etudiant>students = new ArrayList<>();
		students.add(new Etudiant("MedAmine",25));
		students.add(new Etudiant("SalahEddine",21));
		students.add(new Etudiant("Emna",24));
		
		Comparator<Etudiant> compAge = (e1,e2)->e1.getAge() - e2.getAge();
		Comparator<Etudiant> compLongNom = (e1,e2)->e2.getNom().length()- e1.getNom().length();
		Stream<Etudiant> list1 = students.stream();
		list1.filter(e->e.getAge()>=23).sorted(compAge).forEach(System.out::println);
		
		Stream<Etudiant> list2 = students.stream();
		list2.filter(e->e.getNom().length()>=5).sorted(compLongNom).forEach(System.out::println);
	}

}
