package OOPS;

public class Example2 {
	int x; //Create a class attribute
	
	// Create a class constructor for  the main class
	public Example2() {
		x = 5; // Set the initial value for the class attribute x
	}
	
	public static void main(String[] args) {
		Example2 myObj =new Example2();// Create an object of class main (This will call the constructor)
		System.out.println(myObj.x);
	
	}
	

}
