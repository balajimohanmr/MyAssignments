package week3.day1.assignments;

public class Students {
	public void getStudentsInfo(long id) {
		System.out.println("Id is "+id);
	}
	public void getStudentsInfo(long id,String name) {
		System.out.println("Name of the student is "+name +"\nId is :"+id);
	}
	public void getStudentsInfo(String email,long phNo) {
		System.out.println("Email of the student is "+email +"\nPhone No :"+phNo);
	}
	public static void main(String[] args) {
		Students st=new Students();
		st.getStudentsInfo(12345);
		st.getStudentsInfo(12345, "balaji");
		st.getStudentsInfo("balajimohanmr@gmail.com", 1234567890);
		
	}
	

}
