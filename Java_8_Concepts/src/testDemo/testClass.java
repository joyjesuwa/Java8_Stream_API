package testDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = Arrays.asList(1,10,4,2,20,5);
		
		List<Integer> list1= list.stream().filter(x -> x < 6).collect(Collectors.toList());
		System.out.println(list1);
		

	}

}
