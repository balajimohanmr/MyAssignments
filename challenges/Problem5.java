package week2.challenges;

public class Problem5 {
	public static void main(String[] args) {
		int[] nums= {1,5,6,3,7,4,9,2,0,21};
		System.out.println(appearTwice(nums));
		
	}
	
	static boolean appearTwice(int[] nums) {
		for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					return true;
				}
				
			}
		}
		return false;
	}

}
