package oops;

/*Hierarchical Inheritance 
 * In this we have one base class and more than one derived class
*/

class Person1{
	private String name;
	private int age;
	private String gender;
	
	public Person1(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	void displayDetails() {
		System.out.println("Person Name " + name);
		System.out.println("Person Age : " + age);
		System.out.println("Person Gender : " + gender);
	}
}

class Student extends Person1 {
	
	String studentId;
	String major;
	
	
	public Student(String name, int age, String gender, String studentId, String major) {
		super(name, age, gender);
		this.studentId = studentId;
		this.major = major;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Student ID : " + studentId);
		System.out.println("Major" + major);
		
	}	
	
}

class Teacher extends Person{
	
	private String employeeId;
	private String subject;
	
	public Teacher(String name, int age, String gender, String employeeId, String subject) {
		super(name, age, gender);
		this.employeeId = employeeId;
		this.subject = subject;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Subject : " + subject);
	}
	
	
	
	
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student std =  new Student("Reena",23,"Female","101","Science");
		
		System.out.println("Student Details");
		
		std.displayDetails();
		
		System.out.println("----------------------------------------");
		
		Teacher teach = new Teacher("Reena",23,"Female","501","Science");
				
		System.out.println("Teacher Details");
		
		teach.displayDetails();

	}

}
