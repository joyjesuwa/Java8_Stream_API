package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 3, 7);
		
		int result = numbers.stream().reduce(0, (sum, elements) -> sum += elements); //reduce(Identity, Accumulator)
		System.out.println(result);
		
		//Identity is not mandatory. If the Identity is not given in that time inside the reduce() only the accumulator is given, the Identity is empty. If there is some value with that it will do some operation. Without identity it cannot do operation just it will return empty or optional value. Optional has empty type object. So the return type we need to store as Optional<type>.
		Optional<Integer> result1 = numbers.stream().reduce((sum, elements) -> sum += elements); //reduce(Identity, Accumulator)
		System.out.println(result1);
		
//		int sum = 0;
//		for(Integer num : numbers) {
//			 sum += num;
//		}
//		System.out.println(sum);

	}

}
