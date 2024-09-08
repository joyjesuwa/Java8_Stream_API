package builtInFunctions;

import java.util.function.Function;

public class MoreFunctionExamples {
	
	public void findSquare() {
		Function<Integer, Integer> square = input -> input * input;
		System.out.println(square.apply(5));
	}
	
	public void countTheLetters() {
		Function<String, Integer> count = inputString -> inputString.length();
		System.out.println(count.apply("Apple"));
	}
	
	public void covertToUpperCase() {
		Function<String, String> upperCase = inputString -> inputString.toUpperCase();
		System.out.println(upperCase.apply("Programming"));
		
	}
	
	public void checkEmpty() {
		Function<String, Boolean> check = input -> input.isEmpty() || input.isBlank() || input.equals("");
		System.out.println(check.apply(""));
	}
	

	public static void main(String[] args) {
		
		MoreFunctionExamples obj = new MoreFunctionExamples();
		obj.findSquare();
		obj.countTheLetters();
		obj.covertToUpperCase();
		obj.checkEmpty();
	}

}
