package challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem18 {
	public static void main(String[] args) {
		String[] arr = {"aaa","aa","a","a","a","aaa","aa","b"};
		int k = 1;
		List<String> al = new ArrayList<String>(Arrays.asList(arr));
		Set<String> s = new HashSet<String>();
		for (int i = 0; i < al.size(); i++) {
			if ((al.lastIndexOf(al.get(i))) != i)
				s.add(al.get(i));
		}
		al.removeAll(s);
		if (al.size()<k) System.out.println("");
		else System.out.println(al.get(k - 1));
	}

}
