package lambdaExpression;

public class CalculatorRunner {
	
	public void usingClassicalWay() {
		
		ICalculator cal = new CalculatorImpl();
		System.out.println("Using Classical Way :" + cal.add(1, 2));
	}
	
	public void usingAIC() {
		
		ICalculator calc = new ICalculator() {
			
			@Override
			public int add(int num1, int num2) {
				return num1 + num2;
				
			}
		};
		
		System.out.println("Using AIC :" + calc.add(1, 4));
	}
	
	public void usingLambda() {
		
		ICalculator calculator = (int val1, int val2) -> {return val1 + val2;};
		ICalculator calculator1 = (val1, val2) -> val1 + val2;
		System.out.println("Using Lamba :" + calculator.add(3, 4));
		System.out.println("Using Lamba :" + calculator1.add(2, 4));
	}

	public static void main(String[] args) {
		
		CalculatorRunner obj = new CalculatorRunner();
		obj.usingClassicalWay();
		obj.usingAIC();
		obj.usingLambda();
		

	}

}
