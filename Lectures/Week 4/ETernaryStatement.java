import java.util.Scanner;

public class ETernaryStatement {

    public static void main(String[] args) {
		
        // Declare the variables
		int numberOne , numberTwo;
		
		// Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter two integers
        System.out.print("Enter the first integer: ");
        numberOne = input.nextInt();
		
        System.out.print("Enter the second integer: ");
        numberTwo = input.nextInt();

        // Use Ternary Operator to check if two integers are equal
        System.out.println(numberOne == numberTwo ? "The Integers Are Equal" : "The Integers Are Not Equal");
    }
}