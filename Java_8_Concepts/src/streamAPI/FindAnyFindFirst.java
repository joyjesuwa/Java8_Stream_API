package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyFindFirst {
	
	static List<String> num = Arrays.asList("One", "Two", "Three", "Four", "Five");
	
	public static void findFirstEx() {
		
		Optional<String> obj = num.stream().findFirst();
		//Optional<String> obj1 = num.parallelStream().findFirst();
		System.out.println(obj);
			
	}
	
    public static void findAnyEx() {
		
		Optional<String> obj = num.stream().findAny();
		//Optional<String> obj1 = num.parallelStream().findAny();
		System.out.println(obj);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findFirstEx();
		findAnyEx();
		

	}

}
