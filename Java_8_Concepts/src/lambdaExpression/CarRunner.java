package lambdaExpression;

public class CarRunner {
	
	public void classicalWay() {
		ICars obj = new Benz();
		obj.start();
	
	}
	
	public void usingAIC() {
		
		ICars cars = new ICars() {

			@Override
			public void start() {
				System.out.println("Start Car using AIC");
				
			}
		};
		
		cars.start();
	}
	
	public void usingLambda() {
		
		ICars car = () -> System.out.println("Start car using Lambda");
		car.start();
	}
	
	

	public static void main(String[] args) {
		
		CarRunner cr = new CarRunner();
		cr.classicalWay();
		cr.usingAIC();
		cr.usingLambda();
		
		
	}

}
