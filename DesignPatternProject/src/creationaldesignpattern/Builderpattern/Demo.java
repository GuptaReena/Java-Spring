package creationaldesignpattern.Builderpattern;

import creationaldesignpattern.Builderpattern.Employee3.Builder;

public class Demo {

	public static void main(String args[]) {
		
		Employee1 emp1 =  new Employee1();
		emp1.setEmpId(101);
		emp1.setEmpName("Jhon");
		emp1.setEmpAddress("US");
		
		System.out.println(emp1);
		
		
		//we can also create an employee object with method chaining design pattern
		//method chaining design pattern does not work efficiently with concurrent cases
		// so we can go for Builder pattern
		
		Employee2 emp2 = new Employee2();
		emp2.setEmpId(102).setEmpName("Smith").setEmpAddress("Canada");
		
		System.out.println(emp2);
		
		//creating employee object using builder patter
		
		Employee3 emp3 = Employee3.Builder.newInstance()
										  .setId(103)
										  .setName("Eva")
										  .setAddress("India")
										  .build();
		
		System.out.println(emp3);
	}
	
	
}