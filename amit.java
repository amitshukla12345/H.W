public class amit{
    public static void main(String[] args) {
        int n = 567; // Given three-digit number

        // Ensure the number is within the given constraints
        if (n > 0 && n <= 999) {
            // Extract digits
            int hundreds = n / 100;         // Extract the hundreds place
            int tens = (n / 10) % 10;       // Extract the tens place
            int units = n % 10;             // Extract the units place

            // Calculate the sum of digits
            int sum = hundreds + tens + units;

            // Output the result
            System.out.println("The sum of the digits of " + n + " is: " + sum);
        } else {
            System.out.println("The number is out of the valid range (1 to 999).");
        }
    }
}