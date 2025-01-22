import java.util.Scanner;

public class BWhileLoopTrueAndFalsePaths {

    public static void main(String[] args) {
		
		// Declare variables
		int count, inputNumber, sum;
		double average;
		
        // Declare and initialise variables
		count = 1;
		sum = 0;
		
		//Create an object from Scanner class
		Scanner input = new Scanner(System.in);
		
		// Iternate the While Loop 5 times
        while(count <= 5){
			
			// Capture user inputs
			System.out.print("Enter a Number : ");
			inputNumber = input.nextInt();
			
			sum = sum + inputNumber;	// Calculate Sum
			
			count++;	// Increment the counter by 1
		}
		
		average = sum / 5.0;	// Calculate Average
		
		// Display Sum and Average as Outputs
		System.out.println();
		System.out.println("Sum is : " + sum);
		System.out.println("Average is : " + average);
    }
}