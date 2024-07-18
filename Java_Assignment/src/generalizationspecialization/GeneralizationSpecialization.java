package generalizationspecialization;

/*Generalization and specialization
 * We can achieve this with the help of inheritance
 * In that we can access the common method of a parent class in different  child class
 * The method have IS A Relationship between them
 * */


public class GeneralizationSpecialization {
	
	public static void main(String args[]) {
		
		
		
		Vehicle1 veh = new Vehicle1("Cars");
		System.out.println("Vehicle Name : " + veh.getName());
		
		
		Vehicle1 veh1 = new Cars("Toyata");
		System.out.println("Vehicle Name : " + veh1.getName() );
		
		Vehicle1 veh2 = new ToyataCar("Toyata");
		System.out.println("Car Name : " + veh2.getName());
		
		Vehicle1 veh3 = new FordCar("Ford");
		System.out.println("Car Name : " + veh3.getName());
		
		
		
		
	}
	
	

}