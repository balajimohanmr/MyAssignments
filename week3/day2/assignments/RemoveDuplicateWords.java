package week3.day2.assignments;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		Set<String> s=new LinkedHashSet<String>(Arrays.asList(text.split("\\s+")));
		Iterator<String> it=s.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
