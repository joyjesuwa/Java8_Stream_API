package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class LimitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> countries = new ArrayList<>();
		
		countries.add("India");
		countries.add("USA");
		countries.add("UAE");
		countries.add("Singapore");
		
		countries.stream().limit(2).forEach(System.out::println);
	}

}
