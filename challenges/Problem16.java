package challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Problem15 {
	public static void main(String[] args) {
		int[] arr= {2,2,3,4,5,6,11,4,7,8,9,10,4,15,4};int max=0;
		for (int i=0;i<arr.length;i++) {
			int c=Collections.frequency(Arrays.stream(arr).boxed().collect(Collectors.toList()),arr[i]);
			if (c>max && c==arr[i]) max=c;
		}
		System.out.println("Biggest lucky number is : "+max);
		
	}

}
