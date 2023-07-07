package challenges;
import java.util.ArrayList;
public class Problem7 {
	public static void main(String[] args) {
		int[] nums = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0, 0 };
		System.out.println(unique(nums));
	}
	static boolean unique(int[] nums) {
		int n = 0;
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int count = 1;
			if (!al.contains(nums[i]))
				al.add(nums[i]);
			else
				continue;
			for (int j = 0; j < nums.length; j++) {
				if (i == j)
					continue;
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count == n) {
				return false;
			}
			n = count;
		}
		return true;
	}

}
