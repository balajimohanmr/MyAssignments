package challenges;

import java.util.ArrayList;
import java.util.List;

public class Problem20 {
	public static void main(String[] args) {
		String s = "aaabaab";char c = 'b';int j=s.indexOf(c);;
		char sArr[]=s.toCharArray();
		List<Integer> l=new ArrayList<Integer>();
		for (int i=0;i<sArr.length;i++) {
			
			l.add(Math.abs(j-i));
		}
		System.out.println(l);

	}

}
