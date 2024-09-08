package anonymousInnerClass;

public class AICUsingAbstractClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AICUsingAbstractClass obj = new AICUsingAbstractClass() {
			
			@Override
			void findPartner() {
				// TODO Auto-generated method stub
				System.out.println("It is a Life time settlement");
			}
		};
		obj.findPartner();

	}

}
