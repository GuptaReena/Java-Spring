package creationaldesignpattern.Builderpattern;

public class Employee2 {

	int empId;
	String empName;
	String empAddress;
	public int getEmpId() {
		return empId;
	}
	public Employee2 setEmpId(int empId) {
		this.empId = empId;
		return this;
	}
	public String getEmpName() {
		return empName;
	}
	public Employee2 setEmpName(String empName) {
		this.empName = empName;
		return this;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public Employee2 setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
		return this;
	}
	@Override
	public String toString() {
		return "Employee2 [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	
	
	
}
