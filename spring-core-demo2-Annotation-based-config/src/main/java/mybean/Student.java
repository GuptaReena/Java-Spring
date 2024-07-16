package mybean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

//	@Value("504")
	private int studentId;
//	@Value("Ziva")
	private String studentName;
//	@Value("80")
	private int marks;
	


	public Student() {
		
	}


	public Student(@Value("505")int studentId, @Value("Arya")String studentName, @Value("50")int marks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
	}


	public int getStudentId() {
		return studentId;
	}

//	@Value("503")
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}


//	@Value("kaushal")
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public int getMarks() {
		return marks;
	}

//	@Value("80")
	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + "]";
	}
	
}