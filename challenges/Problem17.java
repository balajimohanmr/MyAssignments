package challenges;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Problem17 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,2};
		List<Integer> al= new ArrayList<Integer>();
		Set<Integer> numSet= new HashSet<Integer>();
		for (int i=0;i<nums.length;i++) {
			boolean a= numSet.add(nums[i]);
			if (!a) {
				al.add(nums[i]);
			}
			
		}
		numSet.removeAll(al);
		int sum=0;
		Iterator<Integer> iterator = numSet.iterator();
		while (iterator.hasNext()) {
			sum+=iterator.next();
		}
		System.out.println("Sum of the unique elements is : "+sum);
	}

}
