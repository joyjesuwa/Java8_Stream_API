package methodReference;

import java.util.function.Function;

public class ArbitraryObjectOfAnyType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Function<String, String> lambda_lowerCase = input -> input.toLowerCase(); //Input is a String Object It is given by user is in any Type so it is Random and toLowerCase() is an Instance method of that arbitrary object
//		System.out.println(lambda_lowerCase.apply("JESUWA"));                     //Only i can identify the input is String type by seeing the generic type in Function so it is Random
		
		Function<String, String> metRef_lowerCase = String::toLowerCase;   // arbitraryType::methodName
		System.out.println(metRef_lowerCase.apply("JESUWA"));
		
		

	}

}
