package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMinMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 3, 7);
		
		//Using Lambda
		Optional<Integer> max = numbers.stream().reduce((num1, num2) -> Math.max(num1, num2));
		System.out.println(max);
		
		//Using Method Reference
		Optional<Integer> max1 = numbers.stream().reduce(Integer::max);
		System.out.println(max1);
		
		//Using Lambda
		Optional<Integer> min = numbers.stream().reduce((num1, num2) -> Math.min(num1, num2));
		System.out.println(min);
		
		//Using Method Reference
		Optional<Integer> min2 = numbers.stream().reduce(Integer::min);
		System.out.println(min2);
		
		//count
		long count = numbers.stream().count();
		System.out.println(count);

	}

}
