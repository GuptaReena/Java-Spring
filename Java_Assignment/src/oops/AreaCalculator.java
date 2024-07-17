package oops;
	

//Java Program to demonstrate the real scenario of Java Method Overloading  
//where three methods have the same name but different parameters.


	class AreaCalculator{
		
		public static double calculateArea(double r) {
			
			return Math.PI*r*r;
		}
		
			double calculateArea(int l , int b) {
			
			
			
			return l*b;
		}
		
			double calculateArea(double b, double h) {
			
			return 0.5*b*h;
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AreaCalculator area = new AreaCalculator();
		
		//We can call this method with the class name as it is static 
		System.out.println("Area of a Circle :" + AreaCalculator.calculateArea(5));
		
		System.out.println("Area of Rectangle :" + area.calculateArea(4, 5));
		
		System.out.println("Area of Triangle :" + area.calculateArea(3, 6));
		
		
	}

}
