package challenges;
public class Problem13 {
	public static void main(String[] args) {
		String s = "Myself2 Me1 I4 and3";
		String sArr[] = s.split("\\s+");
		for (int i = 1; i < sArr.length + 1; i++) {
			for (int j = 0; j < sArr.length; j++) {

				if (sArr[j].substring(sArr[j].length() - 1).equals(String.valueOf(i))) {
					System.out.print(sArr[j].substring(0, sArr[j].length() - 1) + " ");
					break;
				}

			}
		}
	}
}
