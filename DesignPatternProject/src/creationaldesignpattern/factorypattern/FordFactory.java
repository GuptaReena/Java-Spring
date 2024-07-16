package creationaldesignpattern.factorypattern;

public class FordFactory extends Factory{

	@Override
	public Cars manufactureCar() {
		// TODO Auto-generated method stub
		return new Ford();
	}

	

}
