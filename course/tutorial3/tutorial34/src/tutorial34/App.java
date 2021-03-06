package tutorial34;

import java.util.ArrayList;
import java.util.HashMap;

/* generics
 * 
 */
public class App {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("apple");
		list.add("bananas");
		list.add("orange");
		
		String fruit = (String)list.get(1);
		System.out.println(fruit);
		
		// Modern
		ArrayList<String> strings = new ArrayList();
		strings.add("cat");
		strings.add("dog");
		strings.add("snakes");
		
		String animal = strings.get(1);
		System.out.println(animal);
		
		// there can be more than one type arguement
		
		HashMap<Integer, String> map = new HashMap<Integer, String> ();
		
		/// Java 7 Style
		
		ArrayList<String> someList = new ArrayList<>();
		
	}

}
