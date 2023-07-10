package week3.day2.assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String text ="I am a software tester";
		String[] txtArr = text.split("\\s+");
		for (int i=0;i<txtArr.length;i++) {
			if (i%2==0) System.out.print(txtArr[i]+" ");
			else {
				for (int j=txtArr[i].toCharArray().length-1;j>=0;j--) {
					System.out.print(txtArr[i].toCharArray()[j]);
				}
				System.out.print(" ");
			}
		}
	}

}
