package challenges;

public class Problem12 {
	public static void main(String[] args) {
		String sentences[]= {"alice and bob love leetcode","i think so too","this is great thanks very much"};
		int max=0;
		for (String sentence:sentences) {
			if (sentence.split("\\s+").length > max) max=sentence.split("\\s+").length;
		}
		System.out.println("Maximum number of words in a string is: "+max);
	}

}
