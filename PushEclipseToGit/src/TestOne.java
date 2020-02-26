import PkgOne.PkgOneTestOne;

public class TestOne {
	
	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("New Line Code");
		System.out.println("This has new lines");
		System.out.println(PkgOneTestOne.s2);	
		TestTwo.sum(2, 3);
		System.out.println("------");
		TestTwo s = new TestTwo();
		s.tryone();
		PkgOneTestOne.s2 = "I am thrid value of s2";
		System.out.println(PkgOneTestOne.s2);
		System.out.println("------");
		s.tryone();
		System.out.println("----------");
		TestTwo.sum(5, 6);
	}
	
	public void one () {
		System.out.println("I am first method in Default Package TestOne");
		
	}

}
