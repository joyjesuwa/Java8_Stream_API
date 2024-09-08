package builtInFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,3,4,7,2);
		//Traditional loop
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===================");
		//For-Each Loop after Java 1.5
		for (Integer listElement : list) {
			System.out.println(listElement);
		}
		
		System.out.println("===================");
		//For-Each function after Java 1.8
		Consumer<Integer> consumer = input -> System.out.println(input);
		list.forEach(consumer);
		
		list.forEach(input -> System.out.println(input)); //Either we can give the consumer interface inside it or else directly give the Lambda inside it.
		

	}

}
