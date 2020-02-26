import PkgOne.PkgOneTestOne;

public class TestOne {
	
	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.out.println("New Line Code");
		System.out.println("This has new lines");
		PkgOneTestOne t1 = new PkgOneTestOne();
		t1.pkonemethodone();
		TestTwo w = new TestTwo();
		w.sum(5, 6);
	

	}
	
	public void one () {
		System.out.println("I am first method in Default Package TestOne");
		
	}

}
