package day4_27122025.classDesign;

public class CheckedVSUncheckExceptions {
	
	public static void infos1() throws Exception{  // Checked exception
		System.out.println("Hello");
	}
	public static void infos2() throws RuntimeException{ // UnChecked exception
		System.out.println("Hello");
	}
	
	public static void main(String[]args)
	{
		try {
			infos1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		infos2();
	}
}
