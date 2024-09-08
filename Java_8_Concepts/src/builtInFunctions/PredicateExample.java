package builtInFunctions;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		
		Predicate<Integer> obj = age -> age >= 18; //Only need to give the input type, no need to give explicitly output type in predicate...Bcz for output it should be only in Boolean.
		
		System.out.println(obj.test(20));

	}

}
