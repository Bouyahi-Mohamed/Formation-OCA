package day1;

public class exampleGC {

        public static void main(String[] args) {
            Animal a1 = new Animal();
            Animal a2 = new Animal();

            a1= null;

            for(int i=0; i<100;i++)
            {
                System.out.println("i = "+i);
            }
            a2= null;
            System.gc();
            double val = 12.3f;
            
            System.out.println("Fin du programme");

        }

    }

