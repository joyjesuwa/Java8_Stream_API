package methodReference;

interface IAdd{
	public void add(int a, int b);
}

public class StaticMethodReference {
	
	public static int sum(int val1, int val2) {
		int val3 = val1 + val2;
		System.out.println(val3);
		return val3;
	}

	public static void main(String[] args) {
		
	//	IAdd obj = (a, b) -> System.out.println(a + B); // No need to re-write the same Impl...You can use the Satic methods impl for this using method reference
		
		IAdd obj = StaticMethodReference::sum; //While using double colon operator no need to give parameter
		obj.add(2, 4);
		

	}

}
