package week1.challenges;

public class MajorityElement {
	public static void main(String[] args) {
		int[] nums= {2,2,1,1,1,2,2};
		int t=(nums.length)/2;
		int flag=0;
		for (int i=0;i<nums.length;i++) {
			int count=0;
			for (int j=0;j<nums.length;j++) {
				if (i==j) continue;
				if (nums[i]==nums[j]) {
					count++;
					if (count+1>t) {
						System.out.println("Majority element is :"+ nums[i]);
						flag=1;
						break;
					}
				}
			}
			if(flag==1) break;
		}
	}

}
