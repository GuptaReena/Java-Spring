package compositionAggregation;

/*Composition and Aggregation has strong and weak relationship

 * Composition has a Strong relation
 * */

class Engine{
	private int horsePower;

	public Engine(int horsePower) {
		super();
		this.horsePower = horsePower;
	}
	
	
	public String start() {
		return "Engine with "  + horsePower  + " horsepower started";
		
	}
}


public class Car {
	
	private String make;
	private String model;
	private Engine engine;
	
	

	public Car(String make, String model, int horsePower) {
		super();
		this.make = make;
		this.model = model;
		this.engine = new Engine(horsePower);
	}


	public String start() {
		
		return make + " " + model + ":" + engine.start();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("Toyata", "Coralla",150);
		
		System.out.println(car.start());
		
	}

}
