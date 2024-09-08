package optionalClass;

public class OptionalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person adam = new Person("Adam", new Car("Civic", new Insurance("Geico")));
		System.out.println(adam.getCarInsuranceName(adam));
		
		Person john = new Person("John", null);
		System.out.println(adam.getCarInsuranceName(john));
		
		

	}

}
