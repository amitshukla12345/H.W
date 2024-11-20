import java.util.Scanner;

class Add1 {
    public static void main(String args[]) {
        int a, b, sum;
        System.out.print("Enter two numbers: ");
        Scanner r = new Scanner(System.in);
        a = r.nextInt();
        b = r.nextInt();
        
        sum = a + b;
        System.out.println("ADDITION: " + sum); 
        
    }
}