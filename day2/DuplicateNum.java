package week1.day2;


import java.util.ArrayList;

public class DuplicateNum {
	public static void main(String[] args) {
		int[] nums= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		for (int i=0;i<nums.length;i++) {
			
			
			for (int j=i+1;j<nums.length;j++) {
				
				if(nums[i]==nums[j]) {
					System.out.println(nums[i]);
					break;
				}
				
			}
			
		}
	}

}
