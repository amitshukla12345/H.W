package Learncollection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
	public static void main(String[] args) {
		
		// Make a collection 
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("ford");
		cars.add("Mazda");
		
		// Get the Iterator
		Iterator<String> b = cars.iterator();
		
		//print the first item
		System.out.println(b.next());
		
		System.out.println("-----------------------------------");
		
		// Loop through a collection
		while(b.hasNext()) {
			System.out.println(b.next());
		}
	}

}
