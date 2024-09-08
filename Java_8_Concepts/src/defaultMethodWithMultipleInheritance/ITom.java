package defaultMethodWithMultipleInheritance;

public interface ITom {
	
	default void print() {
		System.out.println("Tom");
	}

}
