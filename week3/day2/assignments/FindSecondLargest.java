package week3.day2.assignments;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> s= new TreeSet<Integer>();
		for (int i:data) {
			s.add(i);
		}
		ArrayList<Integer> a= new ArrayList<Integer>(s);
		System.out.println("Second largest number is : "+a.get(a.size()-2));

}
}
