package week3.day2.assignments;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name="Balaji";
		Set<String> s=new LinkedHashSet<String>(Arrays.asList(name.split("")));
		Iterator<String> it= s.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		
	
		
	}

}
