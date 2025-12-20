package day2_13122025.part2CoreJavaAPI;

public class ExempleStringBuilder {

	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	//sb.append("123456789");
	sb.append("12345678912345678123456789123456789");
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	}

}
