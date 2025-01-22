public class Tute9Q3 {
	
	// Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method to square an integer
    public static int square(int a) {
        return multiply(a, a); // Reusing the multiply method
    }

    public static void main(String[] args) {
		
		// Calculate (3 * 4 + 5 * 7)²
        int expression1 = square(add(multiply(3, 4), multiply(5, 7)));
        System.out.println("Result of (3 * 4 + 5 * 7)²\t: " + expression1);

        // Calculate (4 + 7)² + (8 + 3)²
        int expression2 = add(square(add(4, 7)), square(add(8, 3)));
        System.out.println("Result of (4 + 7)² + (8 + 3)²\t: " + expression2);
    }
}