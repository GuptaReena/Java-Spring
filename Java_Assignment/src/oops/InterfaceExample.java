package oops;

//Interfaces

 interface Vehicle{
	
	 void start();
	 void stop();
	 String getType();
}

 class Car implements Vehicle{
	 
	 String brand;
	 String model;
	

	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	@Override
	public void start() {
		System.out.println(brand + " " + model + " is starting");
		
	}

	@Override
	public void stop() {
		System.out.println(brand + " " + model + " is stoping");
		
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		
		
		
		return "Car";
	}
	
	void displayDetails() {
		System.out.println("Cars Brand : " + brand);
		System.out.println("Card Model : " + model);
	}
	 
 }

 class Bicycle implements Vehicle{
		
		int gearCount;

		
		
		public Bicycle(int gearCount) {
			super();
			this.gearCount = gearCount;
		}

		@Override
		public void start() {
			System.out.println("Bicycle with " + gearCount + " gear is  started");
			
		}

		@Override
		public void stop() {
			System.out.println("Bicycle with " + gearCount + " gear is  stopping");
			
		}

		@Override
		public String getType() {
			// TODO Auto-generated method stub
			return "Bicycle";
		}
		
		void displayDetails() {
			System.out.println("Bicycle Gear Count : " + gearCount);
		}
	}



public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car("Toyota","Corolla");
		car.start();
		car.stop();
		System.out.println("Vehicle Type : " + car.getType());
		car.displayDetails();
		
		System.out.println("--------------------------------------------");
		
		Bicycle bicycle = new Bicycle(21);
		bicycle.start();
		bicycle.stop();
		System.out.println("Vehiche Type : " + bicycle.getType());
		bicycle.displayDetails();
		
		
		
		
	}

}

