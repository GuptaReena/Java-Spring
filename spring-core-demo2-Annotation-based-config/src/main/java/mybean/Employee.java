package mybean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	
//	Field Injection	
//	@Value("504")
	private int empId;
//	@Value("Sritika")
	private String empName;
	private Address empAdd;
	
	public Employee() {
		super();
	}

	//Construction Injection	
	@Autowired
	public Employee(@Value("504")int empId, @Value("AVA")String empName, Address empAdd) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAdd = empAdd;
	}

	public int getEmpId() {
		return empId;
	}

	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	
	public Address getEmpAdd() {
		return empAdd;
	}

//	Setter Injection
//	@Autowired
	public void setEmpAdd(Address empAdd) {
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAdd=" + empAdd + "]";
	}
	
	
	

}
