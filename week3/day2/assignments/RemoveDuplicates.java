package week3.day2.assignments;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String s ="Paypal India";
		Set<String> s1= new LinkedHashSet<String>(Arrays.asList(s.split("")));
		Iterator<String> it=s1.iterator();
		while (it.hasNext()) {
			String s2=it.next();
			if (s2.equals(" ")) continue;
			System.out.print(s2);
		}
		
	}

}
