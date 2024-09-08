package builtInFunctions;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Last name shouild not be empty
		BiPredicate<String, String> pred1 = (firstName, lastName) -> {
			return lastName.length()>0;
		};
		System.out.println(pred1.test("JOY", ""));
		
		//check equality of two strings
		BiPredicate<String, String> pred2 = (str1, str2) -> {
			return str1.equals(str2);
		};
		System.out.println(pred2.test("JOY", "joy"));
		
		//check equality ignore case sensitivity
		BiPredicate<String, String> pred3 = (input1, input2) -> {
			return input1.equalsIgnoreCase(input2);
		};
		System.out.println(pred3.test("JOY", "joy"));

	}

}
