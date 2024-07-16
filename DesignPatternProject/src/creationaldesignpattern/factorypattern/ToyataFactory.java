package creationaldesignpattern.factorypattern;

public class ToyataFactory extends Factory {

	@Override
	public Cars manufactureCar() {
		// TODO Auto-generated method stub
		return new Toyata();
	}

}
