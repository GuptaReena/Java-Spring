package creationaldesignpattern.singletonpattern;

public class TranslatorLazy {

	
	//step 1 :create an constructor of the class and make it private
	
	private TranslatorLazy() {}
	
	//step 2 : create an reference object of the current class and make it static
	
	static TranslatorLazy translator;
	
	//step 3: create a getInstance method which is creates and return the object if not created
	
	public static TranslatorLazy getInstance() {
		
	if(translator == null) {
		
		translator =  new TranslatorLazy();
	}
	
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