package anonymousInnerClass;

class Parent{
	
	void education() {
		System.out.println("Education is must");
	}
	
	void work() {
		System.out.println("Work is very important");
	}
	
	void findPartner() {
		System.out.println("Finding a good partner is fantastic");
	}
}

public class AICUsingConcreteClassMain {

	public static void main(String[] args) {
		
		Parent child = new Parent() {
			
			void findPartner() {
				System.out.println("Great...!"); //This is Anonymous Inner Class inside the Concrete Class
			} 
			
		};
		
		child.education();
		child.work();
		child.findPartner();
		
		Parent parent = new Parent();  //If you want the parent class Impl.,
		parent.findPartner();
		

	}

}
