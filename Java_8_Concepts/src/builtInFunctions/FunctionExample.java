package builtInFunctions;

import java.util.function.Function;

public class FunctionExample {
	
	public void lambdaStyle() {
		
		Function<Integer, Double> func = usd -> usd * 81.5; // Function<T, R> --> T - type of Input arg, R - type of Return value
		System.out.println(func.apply(10));
		
		
	}
	
	public void usingAIC() {
		
		Function<Integer, Double> func = new Function<Integer, Double>() {
			
			@Override
			public Double apply(Integer t) {
				// TODO Auto-generated method stub
				return t*81.5;
			}
		};
		System.out.println(func.apply(12));
	}
	
	public static void main(String[] args) {
		FunctionExample obj = new FunctionExample();
		obj.lambdaStyle();
		obj.usingAIC();
		
	}

}
