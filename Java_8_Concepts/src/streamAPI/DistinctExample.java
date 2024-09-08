package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = Arrays.asList("Joy", "Jerry", "Jacob", "Mithun", "Joy");
		
		names = names.stream().distinct().collect(Collectors.toList());
		
		//Set<String> setNames = names.stream().collect(Collectors.toSet());
		
		// names.stream().distinct().forEach(System.out::println);
		
		//System.out.println(setNames);
		System.out.println(names);
		

	}

}
