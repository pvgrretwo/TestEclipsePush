package PkgOne;

public class PkgOneTestOne {
	
	public static String s2 = "This is the base value of s2";

	
	public void pkonemethodone() {
		System.out.println("pkonemethodone accessed");
		int a = 10;
		String s1 = "This is first string";
	}
	
	public void multiply (int a, int b) {
		int multi = a*b;
		System.out.println(multi);
	}
	
	public void substract (int a, int b) {
		int sub = a-b;
		System.out.println(sub);
	}
	
	public static void add (int a, int b) {
		int add = a+b;
		System.out.println(add);
	}

}
