package optionalClass;

import java.util.Optional;

public class Person {
	
	private String name;
	
	private Optional<Car> car;

	public Person(String name, Car car) {
		super();
		this.name = name;
		this.car = Optional.ofNullable(car);
	}

	public String getName() {
		return name;
	}

	public Optional<Car> getCar() {
		return car;
	}
	
	public String getCarInsuranceName(Person person) {
		
		
		//Traditional Style of handling Null pointer Exception
//		if(person!=null) {                        
//			Car car = person.getCar();
//			if(car!=null) {
//				Insurance insurance = car.getInsurance(); 
//				if(insurance!=null) {
//					return insurance.getName();
//				}
//			}
//		}
//		return "ONE OF THE VALUES IS NULL";
		
		//Java 8 Optional Style of handling Null pointer Exception
		Optional<Person> optPerson = Optional.ofNullable(person);
		return optPerson.flatMap(Person::getCar)
				.flatMap(Car::getInsurance)
				.map(Insurance::getName)
				.orElse("ONE OF THE VALUES IS NULL");  //If any of the value is Null then It will execute this orElse()
	}
	

}
