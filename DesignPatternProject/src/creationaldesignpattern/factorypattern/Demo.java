package creationaldesignpattern.factorypattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory factory1 = new ToyataFactory();
		Toyata toyata = (Toyata) factory1.manufactureCar();
		System.out.println(toyata.switchOn());
		System.out.println(toyata.switchOff());
		

		Factory factory2 =  new FordFactory();
		Ford ford =  (Ford) factory2.manufactureCar();
		System.out.println(ford.switchOn());
		System.out.println(ford.switchOff());
		
	}

}
