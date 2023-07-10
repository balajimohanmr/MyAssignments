package week3.day2.assignments;

public class Palindrome {
	public static void main(String[] args) {
		String text="HelloolleH1";
		String rev="";
		for (int i =text.length()-1;i>=0;i--) {
			rev+=text.charAt(i);
		}
		if (text.equals(rev)) System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
	}

}
