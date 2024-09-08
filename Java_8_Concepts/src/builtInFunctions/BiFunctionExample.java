package builtInFunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
	
	public void fullName() {

		BiFunction<String, String, String> name = (firstName, lastName) -> firstName + "" + lastName;
		System.out.println(name.apply("Joy", "Jesuwa"));

	}

	public void findAverage() {

		BiFunction<Integer, Integer, Number> average = (num1, num2) -> (num1 + num2) / 2;
		System.out.println(average.apply(8, 4));

	}

	public void concatenateStrings() {
		
		List<String> list1 = Arrays.asList("Bat", "Super", "Wonder");
		List<String> list2 = Arrays.asList("Man", "Man", "Woman");
		List<String> newList = new ArrayList<>();
 
		BiFunction<List<String>, List<String>, List<String>> str = (str1, str2) -> {
			for(int i = 0; i < list1.size(); i++) {
				newList.add(list1.get(i) + list2.get(i));
			}
			return newList;
		};
		System.out.println(str.apply(list1, list2));

	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunctionExample obj = new BiFunctionExample();
		obj.fullName();
		obj.findAverage();
		obj.concatenateStrings();

	}

}
