package challenges;
public class Problem11 {
	public static void main(String[] args) {
		String s = "abcdefgdhicjbklmnopqrstuvwxyzzb";
		int min = 50, secIndx = 50;
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i + 1).contains(s.substring(i, i + 1))) secIndx = s.substring(i + 1).indexOf(s.substring(i, i + 1)) + i + 1;
			if (secIndx < min) min = secIndx;
			if (i > secIndx) break;
		}
		System.out.println(s.charAt(min));
	}
}
