package streamAPI;

import java.util.Arrays;
import java.util.List;

public class AnyMatchAllMatchNoneMatch {
	
	static List<String> status = Arrays.asList("Silent", "Silent", "Shout");
	
	static Boolean result;
	
	public static void anyMatchEx() {
		
		result = status.stream().anyMatch(word -> word.equalsIgnoreCase("shout"));
		System.out.println(result);
		
	}
	
	public static void allMatchEx() {
		
		result = status.stream().allMatch(word -> word.equalsIgnoreCase("silent"));
		System.out.println(result);
		
	}
	
    public static void noneMatchEx() {
		
		result = status.stream().noneMatch(word -> word.equalsIgnoreCase("silent"));
		System.out.println(result);
		
	}


	public static void main(String[] args) {
		
		anyMatchEx();
		allMatchEx();
		noneMatchEx();
		

	}

}
