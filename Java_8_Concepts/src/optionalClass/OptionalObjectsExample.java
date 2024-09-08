package optionalClass;

//import org.junit.Assert.assertTrue;

import java.util.Optional;

//import org.junit.jupiter.api.Test;


public class OptionalObjectsExample {

	//@Test
	public void testUsingEmpty() {
		
		Optional<String> empty = Optional.empty();
//		assertTrue(empty.isEmpty());
//		assertTrue(empty.isPresent());
		
	}
	
	//@Test
	public void testUsingOf() {
		
		String name = "Computer";
		
		Optional<String> nonNullable = Optional.of(name);
//		assertTrue(nonNullable.isEmpty());
//		assertTrue(nonNullable.isPresent());
		
	}
	
	//@Test
	public void testUsingOfNullable() {
		
		String name = "Computer";
		name =null;
		
		Optional<String> nullable = Optional.ofNullable(name);
//		assertTrue(nullable.isEmpty());
//		assertTrue(nullable.isPresent());
		
	}

}
