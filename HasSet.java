import java.util.HashSet;

public class HashSet1 {
	public static void main(String[] args) {
		
		HashSet<String>   cars = new HashSet<String>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Mazda");
		
		/* In the example above, even though BMW is added twice it only appears 
		 once in the set because every item in a set has to be unique*/
		
		System.out.println(cars);
		
		System.out.println(cars.contains("BMW")); 
		
		cars.remove("Mazda"); //To remove an item the remove() method
		
		System.out.println(cars);
		
		// To remove all items, use the clear () method
		
		/*cars.clear();
		System.out.println(cars);*/
		
		System.out.println(cars.size());
		
		//Loop through the items of an HashSet with a for-each loop
		
		for (String i : cars) 
			System.out.println(i);
		
		
		
		
		
	}

}
