package oops;


//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  

class Bank{
	
	double getIntrestRate() {
		return 3.5;
	}
	
}

class SBI extends Bank{

	@Override
	double getIntrestRate() {
		// TODO Auto-generated method stub
		return 3.45;
	}

}


class AXIS extends Bank{
	
	@Override
	double getIntrestRate() {
		// TODO Auto-generated method stub
		return 5.0;
	}

	
}

class HDFC extends Bank{
	
	@Override
	double getIntrestRate() {
		// TODO Auto-generated method stub
		return 8.0;
	}

	
}

public class BankMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SBI banka = new SBI();
		AXIS bankb = new AXIS();
		HDFC bankc = new HDFC();
		
		System.out.println("Bank A Intrest Rate : " +  banka.getIntrestRate());
		System.out.println("Bank B Intrest Rate : " +  bankb.getIntrestRate());
		System.out.println("Bank C Intrest Rate : " +  bankc.getIntrestRate());
	}

}
