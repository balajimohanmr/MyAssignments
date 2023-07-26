package challenges;
public class Problem14 {
	public static void main(String[] args) {
		String[] word1= {"abc","d","defg"};
		String[] word2= {"abcddefg"};
		System.out.println(arrayconcatenate(word1,word2));
	}
	static boolean arrayconcatenate(String[] word1,String[] word2){
		
		String string1="";
		String string2="";
		for (int i=0;i<word1.length;i++) {
			string1+=word1[i];
		}
		for (int j=0;j<word2.length;j++) {
			string2+=word2[j];
		}
		if (string1.equals(string2)) return true;
		else return false;
		
	}

}
