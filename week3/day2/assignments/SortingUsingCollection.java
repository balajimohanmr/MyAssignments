package week3.day2.assignments;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortingUsingCollection {
	public static void main(String[] args) {
		String companies[] = {"HCL","Aspire Systems","Wipro","CTS"};
		Set<String> s = new TreeSet<String>(Arrays.asList(companies));
		Object[] reverse =s.toArray();
		for (int i=reverse.length-1;i>=0;i--) {
			if (i==0) System.out.print(reverse[i]);
			else System.out.print(reverse[i]+",");
		}
		
	}

}
