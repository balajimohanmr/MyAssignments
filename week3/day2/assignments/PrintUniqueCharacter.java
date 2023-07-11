package week3.day2.assignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name = "balaji";
		Set<Character> s = new LinkedHashSet<Character>();
		List<Character> l = new ArrayList<Character>();
		for (char c : name.toCharArray()) {
			boolean a = s.add(c);
			if (!a) {
				l.add(c);
			}
		}
		Iterator<Character> iterator = s.iterator();
		while (iterator.hasNext()) {
			char b = iterator.next();
			if (l.contains(b))
				continue;
			else
				System.out.print(b + " ");

		}

	}

}
