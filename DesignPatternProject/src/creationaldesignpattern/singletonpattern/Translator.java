package creationaldesignpattern.singletonpattern;

public class Translator {
	
	int counter;
	
		//2 Forms of singleton pattern
		//Early Instantiation : The object creation happens at the class load time
		//Lazy Instantiation : The object creation is done according to the requirement
	
	
	
	public String translate(String message) {
		
		System.out.println("Object HashCode" + hashCode());
		
		String output = "It dont understand the word!";
		
		if(message.equalsIgnoreCase("Good Morning")) {
			System.out.println("It is Morning");
		}else if(message.equalsIgnoreCase("Good Afternoon")) {
			System.out.println("It is Afternoon");
		}else if(message.equalsIgnoreCase("Good Evening")) {
			System.out.println("It is Evening or night");
		}
		
		return output;
	}
	
	
}