import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybean.Employee;
import mybean.Student;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stud =  new Student(101,"Reena",90);
		
		System.out.println(stud);
			
		//In the above line the spring core container gets created by taking the xml file
		//and initializing the bean configured in the xml file
		ApplicationContext context =  new ClassPathXmlApplicationContext("anyName.xml");
		
		//This is done by calling the constructor
		Student stud1 = context.getBean("stud", Student.class);
		System.out.println(stud1);
		
		//This is done by calling the setter method
		
		Student stud2 = context.getBean("Student", Student.class);
		
		System.out.println(stud2);
		
		
		//In this example we used dependencyInjection of object  
		
		Employee emp =  context.getBean("emp",Employee.class);
		
		System.out.println(emp);
		
		
		//Verifying singleton scope
		System.out.println("------Verfying Singleton Scope------");
		Student stud3 =  context.getBean("Student", Student.class);
		System.out.println(stud3);
		
		Student stud4 =  context.getBean("Student", Student.class);
		System.out.println(stud4);
		
		
		stud3.setStudentName("Riya");
		System.out.println(stud3);
		System.out.println(stud4);
		
		
		//Verifying prototype scope
		
		System.out.println("------Verifying prototype Scope------");
		Student stud5 = context.getBean("Student", Student.class);
		System.out.println(stud5);
		
		Student stud6 = context.getBean("Student", Student.class);
		System.out.println(stud6);
		
		stud5.setMarks(20);
		System.out.println(stud5);
		System.out.println(stud6);
			
	}

}
