package anonymousInnerClass;

public class AICUsingInterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IParentAICUsingInterface parent = new IParentAICUsingInterface() { //In Core Java For Interface we cannot create an Object for it...So While Doing AIC using Interface we can do that like this...
			
			@Override
			public void findPartner() {
				// TODO Auto-generated method stub
				System.out.println("Finding a good partner is Excellent...!");
				
			}
			
		};
		
		parent.findPartner();

	}

}
