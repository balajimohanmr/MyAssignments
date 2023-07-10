package week3.day2.assignments;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumber {
	public static void main(String[] args) {
		int num[]= {9,9,3,4,1,2,3,3,1,2,6,7,8,6,7};
		Set<Integer> s = new TreeSet<Integer>(IntStream.of(num).boxed().collect(Collectors.toList()));
		Iterator<Integer> it=s.iterator();
		int i=0;
		while (it.hasNext()) {
			if (it.next()-1==i) {
				i++;
				continue; 
			}
			else {
				System.out.println((i+1)+" is the missing number");
				break;
			}
			
		}
		
		
	}

}
