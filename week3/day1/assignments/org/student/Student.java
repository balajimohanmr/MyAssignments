package week3.day1.assignments.org.student;

import week3.day1.assignments.org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("balaji");
		
	}
    public void studentId() {
    	System.out.println("1234");
		
	}
    public void studentDept() {
		System.out.println("ECE");
	}
    
    public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptname();
		s.studentDept();
		s.studentId();
		s.studentName();
	}

}
