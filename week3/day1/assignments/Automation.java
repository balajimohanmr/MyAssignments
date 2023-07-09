package week3.day1.assignments;

public class Automation extends MultipleLanguage {

	public void java() {
		System.out.println("java");
		
	}

	public void selenium() {
		System.out.println("selenium");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}
	public static void main(String[] args) {
		Automation a=new Automation();
		a.java();
		a.selenium();
		a.ruby();
		a.python();
	}
	

}
