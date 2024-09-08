package builtInFunctions;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Object> obj = () -> { 
			Calendar cal = Calendar.getInstance();
			return cal.getTime();
		
		};
		
		System.out.println(obj.get());

	}

}
