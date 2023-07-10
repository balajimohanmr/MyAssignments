package challenges;

public class Problem8 {
	public static void main(String[] args) {
		String s="luffy is still joyboy";
		System.out.println(s.split("\\s+")[((s.split("\\s+")).length)-1].length());
	}

}
