package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Joy Jesuwa", "Jacob Daniel", "Mithun Ashwell");
		
		List<Integer> count = names.stream()
				.map(String::length)
				.collect(Collectors.toList());
		
		count.forEach(System.out::println);
		

	}

}
