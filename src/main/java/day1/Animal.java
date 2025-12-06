package day1;

public class Animal {
    // Les attributs d'instance
    String espece;
    int age;

    //Les attributs de classe
    static int  MAX_AGE = 200;

    //Les constructeurs
    public Animal() {
        System.out.println("Constructeur par défaut Animal");
    }
    public Animal(String espece, int age) {
        System.out.println("Constructeur avec paramètres Animal");
        this.espece = espece;
        this.age = age;
    }

    // Les méthodes d'instance
    public String getEspece() {
        return espece;
    }
    public void setEspece(String espece) {
        this.espece = espece;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Les méthodes de classe
    public static int getMAX_AGE() {
        return MAX_AGE;
    }
    public static void setMAX_AGE(int mAX_AGE) {
        MAX_AGE = mAX_AGE;
    }




    // Les blocs d'initialisation de classe
    // Les blocs d'initialisation d'instance
}
