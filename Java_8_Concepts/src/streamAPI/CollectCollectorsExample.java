package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectCollectorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names  = Arrays.asList("Joy", "Jesuwa", "Jacob", "Jerry", "Mithun");
		
		//toList()
		List<Integer> list = names.stream().map(name -> name.length()).collect(Collectors.toList()); //Using Lambda
		//List<Integer> list = names.stream().map(String::length).collect(Collectors.toList()); //Using Method Reference
		System.out.println(list);
		
		//toList() Example 2
		List<String> list1 = names.stream().filter(name -> name.length()>4).collect(Collectors.toList());
		System.out.println(list1);
		
		//toSet()
		//Set<Integer> set = names.stream().map(name -> name.length()).collect(Collectors.toSet()); //Using Lambda
		Set<Integer> set = names.stream().map(String::length).collect(Collectors.toSet()); //Using Method Reference
		System.out.println(set);
		
		//toList()
		Collection<Integer> collection = names.stream().map(name -> name.length()).collect(Collectors.toCollection(LinkedList::new)); 
		//Collection<Integer> collection = names.stream().map(String::length).collect(Collectors.toCollection(LinkedList::new)); // Collection is an root Interface so need to specify which type of collection inside the method.
		System.out.println(collection);

	}

}
