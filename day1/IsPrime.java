package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n=103;
		int flag=0;
		if(n==1) {
			System.out.println(n+ " is not a prime number");
		}
		else {
			for (int i=2;i<=n/2;i++) {
				if (n%i==0) {
					System.out.println(n+ " is not a prime number");
					flag=1;
					break;
				}
				
					
			}
			if(flag==0) {
				System.out.println(n+" is a prime number");
		}
		
		
		}
		
	}

}
