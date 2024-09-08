package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import optionalClass.Car;
import optionalClass.Insurance;

class Person {

	 String name;
	
	 int age;


	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class ReduceCombinerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person adam = new Person("Adam", 20);
		System.out.println(adam);
		
		Person john = new Person("John", 30);
		System.out.println(john);
		
		List<Person> perosnList = Arrays.asList(adam, john);
		
		int result = perosnList.stream().reduce(0, (total, person) -> total + person.getAge(), Integer::sum ); //reduce(Identity, Accumulator, Combiner)

	}

}
