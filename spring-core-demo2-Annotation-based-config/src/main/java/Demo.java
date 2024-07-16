
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mybean.Employee;
import mybean.Student;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//We are creating the object with the normal constructor
		Student stud1 =  new Student(101,"Reva",30);
		System.out.println(stud1);
		
		
		//Here we are creating the object with the annotation based configuration
		ApplicationContext context = new AnnotationConfigApplicationContext("mybean");
		Student stud2 = context.getBean("student", Student.class);
		
		System.out.println(stud2);
		
		Student stud3 = context.getBean("student",Student.class);
		System.out.println(stud3);
		
		
		//	Field Injection	
		Employee emp =  context.getBean("employee", Employee.class);
		System.out.println("Field Injection :" + emp);
		
		// Constructor Injection
//		Employee emp1 =  context.getBean("employee", Employee.class);
//		System.out.println("Constructor Injection :" + emp1);
		
		// Setter Injection
		Employee emp3 =  context.getBean("employee", Employee.class);
		System.out.println("Setter Injection :" + emp3);
		
		
	}

}