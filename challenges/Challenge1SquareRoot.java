package week1.challenges;

public class Challenge1SquareRoot {
	public static void main(String[] args) {
		int n=1;
		int j;
		for(int i=1;i<=n;i++) {
			
			if(i*i==n){
				System.out.println("Square root of "+n+" is "+i);
				break;
			}
			else if (i*i>n) {
				j=i-1;
				System.out.println("Square root of "+n+" is "+j);
				break;
			}
		}
	}

}
