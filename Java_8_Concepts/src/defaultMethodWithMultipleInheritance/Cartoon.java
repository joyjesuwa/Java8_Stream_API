package defaultMethodWithMultipleInheritance;

public class Cartoon implements ITom , IJerry {  //Here we need to implement any one of the interface methods or we need to override the method in our own impl.,
	
	public void print() {
		
		System.out.println("Tom and Jerry"); //
		
		ITom.super.print(); //either tom or jerry or override
		IJerry.super.print();
		
	}

	public static void main(String[] args) {
		
		ITom obj = new Cartoon();
		obj.print();

	}

}
