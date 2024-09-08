package optionalClass;

import java.util.Optional;

public class Car {
	
	private String name;
	
	private Optional<Insurance> insurance;

	public Car(String name, Insurance insurance) {
		super();
		this.name = name;
		this.insurance = Optional.ofNullable(insurance);  //If we use of() if the value is null the we will face exception.
	}

	public String getName() {
		return name;
	}

	public Optional<Insurance> getInsurance() {
		return insurance;
	}
	
	

}
