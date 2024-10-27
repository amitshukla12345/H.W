package Lambda;

import java.util.ArrayList;

public class Example1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(numbers); 
		
		numbers.forEach( (n) -> { System.out.println(n); } );
		
	}

}
