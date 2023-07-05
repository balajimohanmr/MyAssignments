package challenges;

public class Problem6 {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5,1,2,3,3};
		int k=3;
		System.out.println(problem6(nums,k));
	}
	
	static boolean problem6(int[] nums,int k) {
		
		
		for (int i=0;i<nums.length;i++) {
			for (int j=i+1;j<nums.length;j++) {
				if (nums[i]==nums[j]) {
					if(Math.abs(i-j)<=k) return true;
				}
			}
		}
		return false;
	}

}
