package creationaldesignpattern.singletonpattern;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Translator trans = new Translator();
		
		trans.translate("Good Morning");
		
		Translator trans1 = new Translator();
		
		trans1.translate("Good Evening");
		
		//Early Translation	
		System.out.println("---------------------------------");
		
		System.out.println("Early Singleton pattern");
		
		System.out.println("---------------------------------");
		TranslatorEarly trans2 = TranslatorEarly.getInstance();
		
		trans2.translate("Good Morning");
		
		TranslatorEarly trans3 = TranslatorEarly.getInstance();
		
		trans3.translate("Good Evening");
		
		
		//Lazy Translation
		
		System.out.println("---------------------------------");
		
		System.out.println("Lazy Singleton pattern");
		
		System.out.println("---------------------------------");
		TranslatorLazy trans4 = TranslatorLazy.getInstance();
		
		trans4.translate("Good Morning");
		
		TranslatorLazy trans5 = TranslatorLazy.getInstance();
		
		trans4.translate("Good Evening");
		
		
	}

}