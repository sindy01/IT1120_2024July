import java.util.Scanner;

class DExercise2 {
    public static void main(String[] args) {
		
		// Create a Scanner object for input
        Scanner input = new Scanner(System.in);
		
		// Prompt the user for two integers
        System.out.print("Enter the first integer: ");
        int numberOne = input.nextInt();
        
        System.out.print("Enter the second integer: ");
        int numberTwo = input.nextInt();
        
        // Call the max method and store the result
        int largest = maxNumber(numberOne, numberTwo);
        
        // Display the result
        System.out.println("The largest number is: " + largest);
		
    }
	
	public static int maxNumber(int numberOne, int numberTwo) {
		
        return (numberOne > numberTwo) ? numberOne : numberTwo; // Return the larger of the two
    }
}