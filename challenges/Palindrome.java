package challenges;

public class Palindrome {
	public static void main(String[] args) {
		String s="A man, a plan, a canal:Panama";
		System.out.println(palindrome(s));
	}
	static boolean palindrome(String s) {
		
		String flts=s.replaceAll("\\W","").toLowerCase();
		StringBuffer sb = new StringBuffer(flts);
		if (sb.reverse().toString().equals(flts)) return true;
		else return false;
	}

}
