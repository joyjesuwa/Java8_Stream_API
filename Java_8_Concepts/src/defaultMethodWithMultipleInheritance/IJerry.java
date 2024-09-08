package defaultMethodWithMultipleInheritance;

public interface IJerry {
	
	default void print() {
		System.out.println("Jerry");
	}

}
