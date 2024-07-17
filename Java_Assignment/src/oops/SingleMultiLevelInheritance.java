package oops;

/*Single Level Inheritance
 * In this the base class is inherited by child class
*/

class Person{
	private String name;
	private int age;
	private String gender;
	

	

	public Person(String name, int age, String gender) {
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
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
	}
}



class Employee extends Person{

	private int empId;
	private String department;
	private double salary;
	
	

	public Employee(String name, int age, String gender, int empId, String department, double salary) {
		super(name, age, gender);
		this.empId = empId;
		this.department = department;
		this.salary = salary;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("EmployeeId : " + empId);
		System.out.println("EmpDepartment : " + department);
		System.out.println("Salary : " + salary);
	}
	
	
	
}

/*Multilevel Inheritance
 * In this base class is derived by child class 
 * And the child class is inherited by another child class
 */

class Manager extends Employee{
	
	private int teamSize;
	private double bonus;
	
	
	public Manager(String name, int age, String gender, int empId, String department, double salary, int teamSize,
			double bonus) {
		super(name, age, gender, empId, department, salary);
		this.teamSize = teamSize;
		this.bonus = bonus;
	}


	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	public double getBonus() {
		return bonus;
	}


	public void setBonus(double bonus) {
		this.bonus = bonus;
	}


	@Override
	void displayDetails() {
		// TODO Auto-generated method stub
		super.displayDetails();
		System.out.println("Team Size "  + teamSize);
		System.out.println("Bonus " + bonus);
	}
	
	
	
}



public class SingleMultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee("Reena",23,"Female",105,"IT",50000);
		
		
		System.out.println("Employee Details");
		emp.displayDetails();
		
		System.out.println("------------------------------------------------");
		
		//Multilevel Inheritance	
		Manager mng = new Manager("Reena",23,"Female",105,"IT",50000,5,500000);
		
		System.out.println("Manager Details");
		mng.displayDetails();
 	}

}
