package week3.day1.assignments;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Axis Bank deposit");
	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();
	}

}
