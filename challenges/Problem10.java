package challenges;

public class Problem10 {
	public static void main(String[] args) {
		System.out.println(nonRptChar("loeleetcode"));
	}

	static int nonRptChar(String s) {
		int flag = 0;
		int i;
		for (i = 0; i < s.length(); i++) {
			if ((s.substring(0, i) + s.substring(i + 1)).contains(s.substring(i, i + 1))) flag = -1;
			else {
				flag = 0;
				break;
			}
		}
		if (flag == -1) return flag;
		else return i;
	}
}
