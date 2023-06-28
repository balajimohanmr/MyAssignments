package week1.challenges;

public class HappyNum {
	public static void main(String[] args) {
		System.out.println(happyNum(2));
	}
	
	static boolean happyNum(int num) {
		
		int mod,sum = 0,it = 0,n=num;
		do {

			do {
				mod = n % 10;
				n = n / 10;
				sum += mod * mod;

			} while (n != 0);
			n = sum;
			sum = 0;
			it++;
		} while (n != 1 && it < 100);

		if (n == 1)
			return true;
		else
			return false;
	}

}
