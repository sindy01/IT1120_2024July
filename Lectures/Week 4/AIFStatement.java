import java.util.Scanner;

public class AIFStatement {

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

        // Check if two integers are equal
        if (numberOne == numberTwo) {
			
            System.out.println("The Integers Are Equal");
        }
		
    }
}