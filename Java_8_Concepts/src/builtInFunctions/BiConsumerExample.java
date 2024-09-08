package builtInFunctions;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiConsumer<Integer, Integer> add = (num1, num2) -> System.out.println(num1 + num2);
	   //add.accept(2, 4);
		
		BiConsumer<Integer, Integer> multiply = (num1, num2) -> System.out.println(num1 * num2);
		//multiply.accept(2, 4);
		
		add.andThen(multiply).accept(3, 6);

	}

}
