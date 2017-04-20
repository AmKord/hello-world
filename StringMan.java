
import java.util.*;
public class StringMan {
	public static void main(String[] args) {
		List<String> test = new ArrayList<String>();
		String s = "Hi";
		//test.add("String");
		test.add("A");
		test.add("X");
		test.add("Y");
		test.add("G");
		test.add("P");
		test.add("S");
		test.add("Q");
		test.add("E");
		//test.add(s+s);
		System.out.println(test.size());
		System.out.println("Pre Sorted:");
		System.out.println(test);
		//System.out.println(test.contains("hi"));
		//test.remove("Hi");
		System.out.println("Sorted:");
		Collections.sort(test);
		System.out.println(test);
	}

}
