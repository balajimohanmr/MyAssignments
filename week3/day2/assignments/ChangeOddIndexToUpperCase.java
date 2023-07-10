package week3.day2.assignments;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test="changeme";
		for (int i=0; i<test.toCharArray().length;i++) {
			if (i%2==0) System.out.print(test.toCharArray()[i]);
			else System.out.print((char)(test.toCharArray()[i]-32));
		}
	}

}
