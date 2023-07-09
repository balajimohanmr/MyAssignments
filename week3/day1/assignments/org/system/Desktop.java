package week3.day1.assignments.org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("14 inch");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerModel();
	}

}
