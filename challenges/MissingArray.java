package week1.challenges;

public class MissingArray {
	public static void main(String[] args) {
		int[] nums = { 2, 2, 1, 5, 1 ,6,5,1};
		int i;
		int flag=0;
		for (i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				flag = 0;
				if (i == j)
					continue;
				if (nums[i] == nums[j]) {
					flag = 1;
					break;

				}

			}
			if (flag == 0) {
				System.out.println("Missing number is :" + nums[i]);
				break;

			}
		}

	}

}
