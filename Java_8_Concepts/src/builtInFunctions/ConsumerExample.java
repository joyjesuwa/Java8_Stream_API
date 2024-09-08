package builtInFunctions;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public void usingLambda() {
		
		Consumer<String> con1 = input -> System.out.println(input + " is a word");
		Consumer<String> con2 = input -> System.out.println(input + " da mapla is an emotion");
		
		con1.accept("Vanakkam");
		con2.accept("Vanakkam");
		
		con1.andThen(con2).accept("Vanakkam");;
	}

	public static void main(String[] args) {
		
		ConsumerExample obj = new ConsumerExample();
		obj.usingLambda();

	}

}
