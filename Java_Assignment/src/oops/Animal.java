package oops;

public class Animal {
		
		void walk() {
			System.out.println("I am Walking");
		}
		
	}
	
	 class Bird extends Animal{
		
		void fly() {
			System.out.println("I am flying");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Bird bird =  new Bird();
		bird.fly();
		bird.walk();
		

	}

}
