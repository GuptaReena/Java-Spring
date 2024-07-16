package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mybean.Address;
import mybean.Employee;
import mybean.Student;

@Configuration
public class AppConfig {
	
	@Bean(name ="student")
	public Student reqstudent() {
		
		return new Student(508,"Taato",80);
	}
	
	
	@Bean(name="address")
	public Address address() {
		
		return new Address(102,"UA", "US");
	}
	
	
	@Bean(name="employee")
	public Employee emp(Address add) {
		
		return new Employee(504,"Rakhi",add);
	}

}
