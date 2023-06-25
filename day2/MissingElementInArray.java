package week1.day2;

public class MissingElementInArray {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,7,6,8};
		int a;
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i]>arr[j]) {
					a=arr[i];
					arr[i]=arr[j];
					arr[j]=a;
				}
			}
		}
		int m=0;
		for (int k=arr[m];k<arr.length;k++) {
			if (k!=arr[m]) {
				System.out.println("Missing element is :"+k);
				break;
			}
			m++;
		}
	}

}
