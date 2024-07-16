package creationaldesignpattern.singletonpattern;

public class TranslatorEarly {
	
	// step 1: Create a constructor and make it private
	private TranslatorEarly() {};
	
	//step 2: create a reference of the current class and make it static
	static TranslatorEarly translator;
	
	//step 3: create a static block and initialize the class reference
	static{
		translator = new TranslatorEarly();
	}
	
	//step 4: create a static method that return this object
	public static TranslatorEarly getInstance() {
		return translator;
	}
	
	public String translate(String message) {
		
		System.out.println("Object Hash code" + hashCode());
		
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
