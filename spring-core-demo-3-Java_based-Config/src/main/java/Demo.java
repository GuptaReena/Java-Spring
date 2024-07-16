import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;
import mybean.Employee;
import mybean.Student;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student =  new Student(506, "Ajay", 40);
		System.out.println(student);
		
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
		Student stud = context.getBean("student", Student.class);
		System.out.println(stud);
		
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1);
		
		
	}

}
