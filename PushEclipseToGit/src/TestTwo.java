import PkgOne.PkgOneTestOne;

public class TestTwo {
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(2,3);
		//PkgOneTestOne s = new PkgOneTestOne();
		PkgOneTestOne.add(5, 5);
		System.out.println(PkgOneTestOne.s2);
		

	}
	
	public static void sum (int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		System.out.println("I have added this extra line");
		PkgOneTestOne.add(4, 5);
		System.out.println(PkgOneTestOne.s2);
		PkgOneTestOne.s2 = "New value of this S2";
		System.out.println(PkgOneTestOne.s2);
	}

}
