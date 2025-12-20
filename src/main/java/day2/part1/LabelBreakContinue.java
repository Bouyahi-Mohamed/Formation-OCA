package day2_13122025.part1;

public class LabelBreakContinue {

	
	public static void main(String[] args) {
		outer:for(int i=0;i<10;i++)
		{
			for(int j=0; j<10; j++)
			{
				if(i==5 && j==5)
				{
					//break outer;
				   continue outer;
				}
				System.out.println("( i = "+i+" j = "+j+")");
			}
		}
		System.out.println("Fin du programme");

	}

}
