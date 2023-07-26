package challenges;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem19 {
	public static void main(String[] args) {
		String input[] ={"bella","label","roller"};
		System.out.println(Arrays.asList(commonChars((input))));
	}
	
	static String[] commonChars(String input[]) {
	
	char c1[]=input[0].toCharArray();int flag=0;
	ArrayList<String> arrayList = new ArrayList<String>();
	for (int i=0;i<c1.length;i++) {
		for (int j=1;j<input.length;j++) {
			if (input[j].contains(String.valueOf(c1[i]))) flag=1;
			else {
				flag=0;
				break;
			}
		}
		if(flag==1) arrayList.add(String.valueOf(c1[i]));
	}
	return arrayList.toArray(new String[arrayList.size()] );
	}

}
