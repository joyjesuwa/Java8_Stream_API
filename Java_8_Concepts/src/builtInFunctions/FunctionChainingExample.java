package builtInFunctions;

import java.util.function.Function;

public class FunctionChainingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<String, String> tenth = study -> {
			System.out.println("Complete tenth first");
			return "Complete tenth first";
			
		};
		
		Function<String, String> eleventh = study -> {
			System.out.println("After that come to eleventh");
			return "After that come to eleventh";
			
		};
		
		tenth.apply("Study");
		eleventh.apply("");
		
		tenth.andThen(eleventh).apply(" "); //first it will execute tenth and will execute eleventh which is given as andThen argument
		
		tenth.compose(eleventh).apply("Learn");//first it will execute eleventh which is given as compose arugument and it will execute tenth which is out side the argument

	}

}
